public class BitOperation {
    public static int getithBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;   
    }
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // }
        n=clearIthBit(n, i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }
    public static int clearLastIthBits(int n,int i){
        int BitMask=(~0)<<i;  //~0 or -1 has all 1's
        return n & BitMask;
    }
    public static int clearBitsInRange(int n,int i,int j){
        int a =((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return n>0 && (n&(n-1))==0;
    }
    public static int CountSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getithBit(5, 2));
        System.out.println(setithBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2,1));
        System.out.println(clearLastIthBits(15, 2));
        System.out.println(clearBitsInRange(10,2,4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(CountSetBits(15));
    }
}

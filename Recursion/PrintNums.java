class PrintNums{
    public static int print(int n){
        if(n==1) return 1;
        System.out.print(print(n-1)+" ");
        return n;
    }
    public static void main(String args[]){
        System.out.println(print(15));
    }
}
public class Tiling {
    public static int TilingProb(int n){//2 * n
        if(n==0 || n==1) return 1;
        int verticalTail=TilingProb(n-1);
        int horizontalTail=TilingProb(n-2);
        return verticalTail+horizontalTail;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(TilingProb(n));
    }
}

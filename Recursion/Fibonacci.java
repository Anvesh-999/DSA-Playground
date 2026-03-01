public class Fibonacci {
    public static int NthFibonacci(int n){
        if(n==0 || n==1) return n;
        return NthFibonacci(n-1)+NthFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(NthFibonacci(100));
    }
}

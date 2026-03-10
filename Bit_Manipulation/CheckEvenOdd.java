public class CheckEvenOdd {
    public static void check(int n){
        if((n&1)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        check(19);
        check(80);
    }
}
    
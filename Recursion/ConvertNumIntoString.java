public class ConvertNumIntoString {
static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void NumberToString(int n){
        if(n==0) return;
        int lastDigit = n%10;
        NumberToString(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int n=1234;
        NumberToString(n);
    }
}

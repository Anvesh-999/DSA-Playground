import java.util.Arrays;
public class AnagramCheck {
    public static boolean CheckAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        char []str1charArr=str1.toCharArray();
        char []str2charArr=str2.toCharArray();
        Arrays.sort(str1charArr);
        Arrays.sort(str2charArr);
        if(Arrays.equals(str1charArr, str2charArr)) return true;
      return false;
    }
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        System.out.println(CheckAnagram(str1,str2));
    }
}

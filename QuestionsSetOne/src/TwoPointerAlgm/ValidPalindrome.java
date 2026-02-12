package TwoPointerAlgm;
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right) {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string input");
        String str = s.nextLine();
        System.out.println(ValidPalindrome.isPalindrome(str));
        s.close();
    }
}
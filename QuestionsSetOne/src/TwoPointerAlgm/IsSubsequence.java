package TwoPointerAlgm;
import java.util.*;
public class IsSubsequence {
    public static boolean checkSubsequence(String s , String t){
        int i = 0,j = 0;
        while(i< s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s:");
        String s = sc.next();
        System.out.print("Enter t:");
        String t = sc.next();
        System.out.println(IsSubsequence.checkSubsequence(s,t));
        sc.close();
    }
}

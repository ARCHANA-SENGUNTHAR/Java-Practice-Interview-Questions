package HashingFreq;
import java.util.*;
public class ValidAnagram {
    public static boolean checkAnagram(String s1,String s2){
        //Using Frequency Count method
        int [] count = new int[26];
        if(s1.length() != s2.length())return false;
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int c : count){
            if(c!=0)return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String s1 = s.next();
        String s2 = s.next();
        System.out.println("Both are anagrams: "+ ValidAnagram.checkAnagram(s1,s2));
        s.close();
    }
}

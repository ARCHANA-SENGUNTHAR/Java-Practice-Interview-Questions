package HashingFreq;
import TwoPointerAlgm.IsSubsequence;

import java.util.*;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        Map<Character,Character> hm = new HashMap<>();
        if(s.length() != t.length())return false;
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(hm.containsKey(c1)){
                if(!hm.get(c1).equals(c2))return false;
            }
            else{
                if(hm.containsValue(c2))return false;
                hm.put(c1,c2);
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s:");
        String s = sc.next();
        System.out.print("Enter t:");
        String t = sc.next();
        System.out.println("Given strings are isomorphic: "+IsomorphicStrings.isIsomorphic(s,t));
        sc.close();
    }
}

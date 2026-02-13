package HashingFreq;

import TwoPointerAlgm.ValidPalindrome;

import java.util.Scanner;
import java.util.*;
public class FirstUniqueCharacter {
    public static int firstUniqChar(String s){
        int freq [] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string input: ");
        String str = s.nextLine();
        System.out.println(FirstUniqueCharacter.firstUniqChar(str));
        s.close();
    }
}

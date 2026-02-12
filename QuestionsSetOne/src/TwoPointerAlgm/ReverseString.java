package TwoPointerAlgm;
import java.util.*;
public class ReverseString {
    public static void reverse(char [] s){
        int left=0,right=s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input size:");
        int n =s.nextInt();
        char [] str = new char[n];
        System.out.print("Enter char array:");
        for(int i=0;i<str.length;i++)str[i]=s.next().charAt(0);
        ReverseString.reverse(str);
        for(char ch : str)System.out.print(ch+" ");
        s.close();
    }
}

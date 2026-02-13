package StackBased;
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())return false;

                if( st.peek() == '(' && ch==')' || st.peek() == '{' && ch=='}' || st.peek()=='[' && ch==']'){
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.next();
        System.out.println("Given strings are Valid Parentheses: "+ ValidParentheses.isValid(s));
        sc.close();
    }
}

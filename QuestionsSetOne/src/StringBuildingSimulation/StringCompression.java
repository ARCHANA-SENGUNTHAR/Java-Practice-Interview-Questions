package StringBuildingSimulation;
import java.util.*;
public class StringCompression {
    public static int compress(char[] chars){
        int index=0,start=0;
        while(start<chars.length){
            int end = start;
            while(end < chars.length && chars[start]==chars[end]){
                end++;
            }
            int position = end-start;
            chars[index++]=chars[start];
            if(position>1){
                char [] freq = String.valueOf(position).toCharArray();
                for(char c : freq)chars[index++]=c;
            }
            start=end;
        }
        return index;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.next();
        System.out.println("Compressed String length: "+ StringCompression.compress(s.toCharArray()));
        sc.close();
    }
}

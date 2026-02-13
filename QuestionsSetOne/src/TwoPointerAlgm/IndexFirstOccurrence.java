package TwoPointerAlgm;
import java.util.*;
public class IndexFirstOccurrence {
    public static int getFirstOccur(String s, String t){
        int i=0;
        for(i=0;i<=s.length()-t.length();i++){
            int j;
            for(j=0;j<t.length();j++){
                if(s.charAt(i+j)!=t.charAt(j)) {
                    break;
                }
            }
            if(j == t.length()){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Haystack:");
        String s = sc.next();
        System.out.print("Enter Needle:");
        String t = sc.next();
        System.out.println(IndexFirstOccurrence.getFirstOccur(s,t));
        sc.close();
    }
}

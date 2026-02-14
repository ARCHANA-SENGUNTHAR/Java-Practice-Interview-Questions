package HashingFreq;
import java.util.*;
public class WordPattern {
    public static boolean wordPattern(String pattern, String s){
        String [] parts = s.split("\\s+");
        Map<Character,String> freq = new HashMap<>();
        if(pattern.length() != parts.length)return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(freq.containsKey(ch)){
                if(!freq.get(ch).equals(parts[i]))return false;
            }
            else{
                if(freq.containsValue(parts[i]))return false;
                freq.put(ch,parts[i]);
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern and string: ");
        String pattern = sc.next();
        String s = sc.nextLine().trim();
        System.out.println("Are these strings forming word pattern: "+wordPattern(pattern,s));
        sc.close();
    }
}

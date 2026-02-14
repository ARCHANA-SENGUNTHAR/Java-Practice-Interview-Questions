package HashingFreq;
import java.util.*;
public class SortCharByFreq {
    public static String frequencySort(String s){
        StringBuilder result = new StringBuilder();
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> al = new ArrayList<>(freq.keySet());
        al.sort((a,b)->freq.get(b)-freq.get(a));
        for(char ch : al){
            for(int i=0;i<freq.get(ch);i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println(frequencySort(str));
        sc.close();
    }
}

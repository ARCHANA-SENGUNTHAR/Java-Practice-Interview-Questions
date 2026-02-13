package HashingFreq;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> hm = new HashMap<>();
        for(String temp : strs){
            char [] letters = temp.toCharArray();
            Arrays.sort(letters);
            String sortStr = String.valueOf(letters);
            hm.putIfAbsent(sortStr,new ArrayList<>());
            hm.get(sortStr).add(temp);
        }
        return new ArrayList<>(hm.values());
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = s.nextInt();
        String [] strs = new String [n];
        System.out.print("Enter array Elements:");
        for(int i=0;i<n;i++){
            strs[i]=s.next();
        }
        System.out.println(GroupAnagrams.groupAnagrams(strs));
        s.close();
    }
}

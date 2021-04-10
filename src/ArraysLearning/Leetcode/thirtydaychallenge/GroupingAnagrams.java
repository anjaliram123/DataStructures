package ArraysLearning.Leetcode.thirtydaychallenge;

//This is taking more time than by doing Arrays.sort
import java.util.*;

public class GroupingAnagrams {

    public static void main(String[] args) {
        GroupingAnagrams g = new GroupingAnagrams();
        String s [] = {"eat", "tea","tan", "ate", "nat", "bat"};
        List<List<String>> li = g.groupAnagrams(s);
        for(List<String> lis : li){
            System.out.println(lis);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        for(String s : strs) {
            char c [] = s.toCharArray();
            int count [] = new int[26];
            for(char cc : c) {
                count[cc -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<count.length;i++) {
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

}


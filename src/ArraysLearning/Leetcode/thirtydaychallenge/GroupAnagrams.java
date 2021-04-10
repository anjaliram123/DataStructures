package ArraysLearning.Leetcode.thirtydaychallenge;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String s [] = {"eat", "tea","tan", "ate", "nat", "bat"};
        List<List<String>> li = ga.groupAnagrams(s);
        for(List<String> lis : li){
            System.out.println(lis);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        for(String s:strs) {
          char [] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

}

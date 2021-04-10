package ArraysStrings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = g.groupAnagrams(strs);
        res.forEach(System.out::println);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int index[] = new int[26];
        for(int i=0;i<strs.length;i++) {
            Arrays.fill(index,0);
            String s = strs[i];
            for(char c : s.toCharArray()){
                index[c-'a']++;
            }
            StringBuilder b = new StringBuilder();
            for(int j=0;j<26;j++) {
                b.append('#');
                b.append(index[j]);
            }
            String k = b.toString();
            if(!ans.containsKey(k)) {
                ans.put(k, new ArrayList());
            }
            ans.get(k).add(s);
        }
        return new ArrayList(ans.values());
    }
}

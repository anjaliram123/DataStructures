package ArraysStrings;

import java.util.HashMap;

public class TwoStringsHackerRank {

    public static void main(String[] args) {
        TwoStringsHackerRank t = new TwoStringsHackerRank();
        String finalString = t.twoStrings("hello", "world");
        System.out.println(finalString);
    }

    public String twoStrings(String s1, String s2) {
        char [] c1 = s1.toCharArray();
        HashMap<Character, Integer> maps = new HashMap<>();
        for(char c:c1){
            maps.put(c, maps.getOrDefault(c,0)+1);
        }

        String finalString = "";
        char c2[] = s2.toCharArray();
        for(char c:c2) {
            if(maps.containsKey(c) && maps.get(c)>0){
               return "YES";
            }
        }
         return "NO";
    }




}

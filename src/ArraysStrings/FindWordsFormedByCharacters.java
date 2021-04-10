package ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FindWordsFormedByCharacters {

    public static void main(String[] args) {

        FindWordsFormedByCharacters f = new FindWordsFormedByCharacters();
        String words[] = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int length = f.getchars(words, chars);
        System.out.println(length);
    }

    public int getchars(String[] words, String chars) {
        ArrayList<String> li = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String res = "";
            char[] given = words[i].toCharArray();
            for (char c : given) {
                if (chars.indexOf(c) >= 0) {
                    res = res + c;
                } else {
                    res = null;
                    break;
                }
            }
            if(res!=null) {
                li.add(res);
            }
        }


        int count = 0;

        if(li==null || li.size()==0){
            return count;
        }
        for (int i = 0; i < li.size(); i++) {
            char [] c = li.get(i).toCharArray();
            for(char k:c){
                count++;
            }
        }

        return count;
    }
}

package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class FindWordsFormedByCharacterFrequency {

    public static void main(String[] args) {
        String [] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        FindWordsFormedByCharacterFrequency f = new FindWordsFormedByCharacterFrequency();
        int count = f.countCharacters(words,chars);
        System.out.println("The count is " +count);

    }

    public int countCharacters(String[] words, String chars){
        HashMap<Character, Integer> charmap = new HashMap();
        char[] c = chars.toCharArray();
        for(int i=0;i<c.length;i++){
            if(charmap.containsKey(c[i])){
                int value = charmap.get(c[i]);
                value = value+1;
                charmap.put(c[i],value);
            }else {
                charmap.put(c[i],1);
            }
        }

        int res=0;
        HashMap<Character, Integer> copymap;
        for(int i=0;i<words.length;i++) {
            copymap = (HashMap<Character, Integer>) charmap.clone();
            char[] b = words[i].toCharArray();
            boolean fail = false;
            for(int k=0;k<b.length;k++){
                if(copymap.get(b[k]) == null || copymap.get(b[k]) <= 0){
                    fail = true;
                    break;
                } else {
                    copymap.put(b[k], copymap.get(b[k]) - 1);
                }
            }
            if(!fail){
                res = res+words[i].length();
            }

        }
        return res;
    }
}

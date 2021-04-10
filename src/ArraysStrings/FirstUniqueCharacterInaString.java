package ArraysStrings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterInaString{

    public static void main(String[] args) {
        FirstUniqueCharacterInaString f = new FirstUniqueCharacterInaString();
        int res = f.firstUniqChar("loveleetcode");
        System.out.println(res);
    }

    public int firstUniqChar(String s){
        if(s==null || s.isEmpty()){
            return -1;
        }
        LinkedHashMap <Character,Integer> maps= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0)+1);
        }

        for( Map.Entry<Character,Integer> e :maps.entrySet()){
            int val = e.getValue();
            int index=0;
            if(val==1){
                index = s.indexOf(e.getKey());
                return index;
            }
        }
        return -1;
    }
}

package ArraysLearning.Leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){
            if(entry.getValue() == 1) {
                int res = entry.getKey();
            }
        }
    }
}

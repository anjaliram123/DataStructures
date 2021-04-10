package ArraysLearning.Leetcode.PriorityQueue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static void main(String[] args) {
        FrequencySort f = new FrequencySort();
        String s = "tree";
        String res = f.frequencySort(s);
        System.out.println("The sortes string is " + res);
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                count = count + 1;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((n1, n2) -> n2.getValue()-n1.getValue());
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            pq.offer(characterIntegerEntry);
        }

        StringBuilder sb = new StringBuilder();
        while(pq.size() > 0) {
           Map.Entry<Character, Integer> entryval = pq.poll();
           for(int i=0;i<entryval.getValue();i++) {
               sb.append(entryval.getKey());
           }
        }

        return sb.toString();
    }
}

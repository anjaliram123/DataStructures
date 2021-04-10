package ArraysLearning.Leetcode.PriorityQueue;

import java.util.*;

public class TopKFrequentWords {

    public static void main(String[] args) {
        TopKFrequentWords t = new TopKFrequentWords();
        String [] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> res = t.topKFrequent(words, 4);
        res.forEach(System.out::println);

    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> maps = new HashMap<>();
        for(String s : words) {
            maps.put(s, maps.getOrDefault(s,0)+1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((n1,n2) -> maps.get(n1).equals(maps.get(n2)) ? n1.compareTo(n2) :maps.get(n1).compareTo(maps.get(n2)) );

        for(String s : maps.keySet()) {
            heap.add(s);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        String[] top = new String[k];
        for(int i=k-1;i>=0;i--) {
            top[i] = heap.poll();
        }
        return Arrays.asList(top);
    }
}

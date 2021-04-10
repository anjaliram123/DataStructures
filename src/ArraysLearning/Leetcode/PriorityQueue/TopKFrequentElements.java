package ArraysLearning.Leetcode.PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();
        int nums [] = {1,1,1,2,2,3};
        int res [] = t.topKFrequent(nums, 2);
        for(int i=0;i<res.length;i++) {
            System.out.print(" "+res[i]);
        }
    }

    //here we are proving o(Nlogk) is better than o(NlogN)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            maps.put(nums[i], maps.getOrDefault(nums[i],0)+1);
        }

        //min priority queue
        PriorityQueue<Integer> minheap = new PriorityQueue<>((n1,n2) -> maps.get(n1)-maps.get(n2));


        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: maps.keySet()) {
            minheap.add(n); //this take O(klogk) time - adding each element take logk time we are adding k times
            if (minheap.size() > k)
            {
                minheap.poll();// this takes O((N-k)logk) time -  as we are removing N-k elements
            }
        }
        // ifwe add o(klogk) + o((N-k)logk) - it gives o(Nlogk)

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = minheap.poll();
        }
        return top;

    }
}

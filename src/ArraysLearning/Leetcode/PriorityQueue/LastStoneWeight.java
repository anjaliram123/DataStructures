package ArraysLearning.Leetcode.PriorityQueue;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        LastStoneWeight l = new LastStoneWeight();
        int stones [] = {2,7,4,1,8,1};
        int res = l.lastStoneWeight(stones);
        System.out.println(res);
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> n2-n1);
        for(int i=0;i<stones.length;i++) {
            pq.offer(stones[i]);
        }

        while(pq.size() > 1) {
            int max1=0;
            int max2=0;
            if(!pq.isEmpty()) {
                max1 = pq.poll();
            }
            if(!pq.isEmpty()) {
                max2 = pq.poll();
            }
            int m = max1-max2;
            if(m >= 1) {
                pq.offer(m);
            }
        }
        if(!pq.isEmpty()) {
            return pq.poll();
        }
        return 0;
    }

}

package ArraysLearning.Leetcode.PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMaxPQ {

    public static void main(String[] args) {
        SlidingWindowMaxPQ slidingWindowMaxPQ = new SlidingWindowMaxPQ();
        int[] nums = {1};
        int k = 1;
        int [] res = slidingWindowMaxPQ.maxSlidingWindow(nums,k);
        for(int i : res) {
            System.out.print(i+",");
        }

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0){
            return new int[0];
        }

        PriorityQueue<Integer> maxpq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        ArrayList<Integer> li = new ArrayList<>();
        int [] res = new int[nums.length-k+1];
        for(int i=0; i<nums.length; i++) {
            maxpq.add(nums[i]);
            li.add(nums[i]);
            if(maxpq.size() == k) {
                res[i-k+1] = maxpq.peek();
                maxpq.removeAll(li);
                i=i-k+1;
            }
        }
        return res;
    }


}

package ArraysLearning.Leetcode.PriorityQueue;

import java.util.ArrayDeque;

public class SldingWindowMaxDQ {

    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();

    public static void main(String[] args) {
        SldingWindowMaxDQ sldingWindowMaxDQ = new SldingWindowMaxDQ();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] res = sldingWindowMaxDQ.maxSlidingWindow(nums,k);
        for(int i : res) {
            System.out.print(i+",");
        }

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || k==0){
            return new int[0];
        }

        if(k==1){
            return nums;
        }
        int res[] = new int[nums.length-k+1];
        int maxidx = 0;
        for(int i=0;i<k;i++) {
            clean_deque(i, k, nums);
            deq.addLast(i);
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }
        }
        res[0] = nums[maxidx];

        for(int i=k;i<nums.length;i++) {
            clean_deque(i, k, nums);
            deq.addLast(i);
            res[i - k + 1] = nums[deq.getFirst()];
        }
        return res;
    }

    public void clean_deque(int i, int k, int nums[]) {
        //keep indexes belonging to current window only
        //suppose if deuqe has indexes 1,2,3,4 and k = 3 we need to have only 2,3,4 in dq so removed i-k which is 4-3 = 1 //remove index 1 from dq
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }


}

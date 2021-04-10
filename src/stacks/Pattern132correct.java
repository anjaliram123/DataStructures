package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pattern132correct {

    public static void main(String[] args) {
        Pattern132correct p = new Pattern132correct();
        int nums []= new int[]{3,5,0,3,4};
        boolean pattern = p.find132pattern(nums);
        System.out.printf("The pattern is "+pattern);
    }

    //here we should take care of i<j<k and nums[i]<nums[k]<nums[j]
    //second is nums[k] - if we find second the first should be less than second - the first is nums[i]

    public boolean find132pattern(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int second = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0;i--) {
            if(nums[i] < second) {
                return true;
            }
            while(!st.isEmpty() && nums[i] > st.peek()) {
                second = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}

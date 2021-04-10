package stacks;

import java.util.Stack;

public class Pattern132 {

    public static void main(String[] args) {
        Pattern132 p = new Pattern132();
        int nums[] = new int[]{-2,1,2,-2,1,2};
        boolean pattern = p.find132pattern(nums);
        System.out.println("The pattern is "+pattern);
    }


    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] prev = new int[nums.length];
        int[] next = new int[nums.length];
        int N = nums.length;
        //find previous less element Index for each using Increasing Monotone Stack
        for(int i=0;i<N;i++) {
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            prev[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }

        st = new Stack<>();
        //find next less element index for each using Increasing Monotone stack
        for(int k = N-1; k >= 0; --k) {
            while(!st.isEmpty() && nums[st.peek()] >= nums[k]) {
                st.pop();
            }
            next[k] = st.isEmpty()? N : st.peek();
            st.push(k);
        }

        boolean pattern = false;
        for (int j = 0; j < N; j++) {
            if(prev[j] != -1 && next[j] != N) {
                int first = nums[prev[j]];
                int third= nums[j];
                //we need to find second
                //starting at next[j]
                int secondIndex = next[j];
                while(secondIndex >-1 && secondIndex<N){
                          if(first < nums[secondIndex] && nums[secondIndex] < third) {
                             return true;
                          }
                    secondIndex++;
                }
            }
        }
        return pattern;
    }
}

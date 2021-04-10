package stacks;

import java.util.Stack;

public class NextGreaterElement2 {

    public static void main(String[] args) {
        NextGreaterElement2 nxt = new NextGreaterElement2();
        int nums[] = {1,2,1};
        int res [] = nxt.nextGreaterElements(nums);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int N = nums.length;
        int next[] = new int[N];
        for(int i=2*N-1; i>=0; i--) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i%N]) {
                st.pop();
            }
            next[i%N] = st.isEmpty() ? -1:nums[st.peek()];
            st.push(i%N);
        }
        return next;
    }
}

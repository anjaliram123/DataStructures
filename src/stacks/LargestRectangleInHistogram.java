package stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
        int [] heights = {2,1,5,6,2,3};
        int res = l.largestRectangleArea(heights);
        System.out.println("The largest rectangle is "+res);
    }

    public int largestRectangleArea(int[] heights) {
        //The trick here is to find the distance between previousLessIndex and NextLessIndex for width and multiply this with A[i] for area
        //That can be achieved by using the technique used in SubArrayMinimumStack
        Stack<Integer> st = new Stack<>();
        int[] prev = new int[heights.length];
        int[] next = new int[heights.length];
        int N = heights.length;
        //find previous less element Index for each using Increasing Monotone Stack
        for(int i=0;i<N;i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            prev[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }

        st = new Stack<>();
        //find next less element index for each using Increasing Monotone stack
        for(int k = N-1; k >= 0; --k) {
            while(!st.isEmpty() && heights[st.peek()] > heights[k]) {
                st.pop();
            }
            next[k] = st.isEmpty()? N : st.peek();
            st.push(k);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; ++i) {
            max = Math.max(max, heights[i]*(next[i]-prev[i]-1));
        }
        return max;
    }
}

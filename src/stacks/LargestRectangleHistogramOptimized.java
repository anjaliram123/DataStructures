package stacks;

import java.util.Stack;

public class LargestRectangleHistogramOptimized {

    public static void main(String[] args) {
        LargestRectangleHistogramOptimized l = new LargestRectangleHistogramOptimized();
        int heights[] = {2,1,5,6,2,3};
        int res = l.largestRectangleArea(heights);
        System.out.println(res);
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int length = heights.length;
        int maxArea = 0;
        for(int i=0;i<length;i++) {
            while(st.peek()!= -1 && heights[st.peek()] >= heights[i]) {
                int curH = heights[st.pop()];
                int currW = i-st.peek()-1;
                maxArea = Math.max(maxArea, (curH * currW));
            }
            st.push(i);
        }

        while(st.peek() != -1) {
            int curH = heights[st.pop()];
            int currW = length-st.peek()-1;
            maxArea = Math.max(maxArea, (curH * currW));
        }

        return maxArea;
    }
}

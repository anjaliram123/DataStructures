package stacks;

import java.util.Stack;

public class MaximumRectangle {

    public static void main(String[] args) {
        MaximumRectangle maximumRectangle = new MaximumRectangle();
        char matrix[][] = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int res = maximumRectangle.maximalRectangle(matrix);
        System.out.println(res);
    }

    public int maximalRectangle(char[][] matrix) {
        //the trick here is to find height of each row from top and then apply largest rectangular histogram methodx
        if (matrix.length == 0) return 0;
        int dp[] = new int[matrix[0].length];
        int maxArea = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                dp[j] = matrix[i][j] == '1' ? dp[j]+1 : 0;
            }
            maxArea = Math.max(maxArea, leetcode84(dp));
        }
        return maxArea;
    }

    public int leetcode84(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int N = heights.length;
        st.push(-1);
        int maxArea = 0;
        for(int i=0;i<N;i++) {
            while(st.peek() != -1 && heights[st.peek()] >= heights[i]) {
                int currH = heights[st.pop()];
                int currW = i - st.peek() - 1;
                maxArea = Math.max(maxArea, currH * currW);
            }
            st.push(i);
        }
        while(st.peek() != -1) {
            int currH = heights[st.pop()];
            int currW = N - st.peek() - 1;
            maxArea = Math.max(maxArea, currH * currW);
        }
        return maxArea;
    }
}

package stacks;

public class TrapppingRainWaterNoStack {

    public static void main(String[] args) {
        TrapppingRainWaterNoStack tr = new TrapppingRainWaterNoStack();
        int heights [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = tr.trap(heights);
        System.out.println("The result is "+res);
    }

    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;
        while(left<right) {
            if(heights[left] < heights[right]) {
                if(leftmax > heights[left]) {
                    ans = ans + leftmax - heights[left];
                } else {
                    leftmax = heights[left];
                }
                left++;
            } else {
                if(rightmax > heights[right]) {
                    ans = ans + rightmax - heights[right];
                } else {
                    rightmax = heights[right];
                }
                right--;
            }
        }
        return ans;
    }
}

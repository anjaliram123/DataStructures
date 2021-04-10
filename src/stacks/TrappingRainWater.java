package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {

    public static void main(String[] args) {
        TrappingRainWater tr = new TrappingRainWater();
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = tr.trap(height);
        System.out.println("The trapped water is "+trappedWater);
    }


    public int trap(int[] height) {
        int totalWater = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int right=0;right<height.length;right++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[right]) {
                int bottom = stack.pop();
                if(stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int width = right - left - 1;
                int h = Math.min(height[right], height[left]) - height[bottom];
                int water = width * h;
                totalWater += water;
            }
            stack.push(right);
        }
        return totalWater;
    }
}

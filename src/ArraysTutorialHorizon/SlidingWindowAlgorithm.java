package ArraysTutorialHorizon;

import java.util.Deque;
import java.util.LinkedList;

//using Deque
public class SlidingWindowAlgorithm {

    public static void main(String[] args) {
        SlidingWindowAlgorithm sd = new SlidingWindowAlgorithm();
        int nums[]={1,2,3,2,4,1,5,6,1};
        int k = 3;
        sd.slidingwindow(nums, k);
    }

    public void slidingwindow(int[] nums, int k) {

        Deque<Integer> d = new LinkedList<>();

        for(int i=0;i<k;i++) {
            while (!d.isEmpty() && nums[d.peekLast()] <= nums[i]) {
                d.removeLast();
            }
            d.addLast(i);
        }

        for(int i=k;i<nums.length;i++) {

            System.out.print(nums[d.peekFirst()] +" ");

            //remove elements which are out of window limit
            while(!d.isEmpty() && d.peekFirst()<=i-k)
            {
                d.removeFirst();
            }

            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i]) {
                d.removeLast();
            }
            d.addLast(i);
        }
        System.out.println(nums[d.peekFirst()] +" ");
    }
}

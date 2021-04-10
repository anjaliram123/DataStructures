package ArraysTutorialHorizon;

public class SlidingWindowMaxsum {
//used to reduce time complexity from o(n2) to o(n)

    public static void main(String[] args) {
        SlidingWindowMaxsum swm = new SlidingWindowMaxsum();
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(swm.slidingwindow(arr, n, k));
    }

    public int slidingwindow(int [] nums, int n, int k) {

        if(n < k){
            System.out.println("Invalid");
            return -1;
        }
        //first compute max sum for first k elements
        int max_sum=0;
        for(int i=0;i<k;i++) {
             max_sum  = max_sum +nums[i];
        }

        int window_sum=max_sum;
        for(int j=k;j<nums.length;j++) {
            //get new window sum by adding first element of next window and
            //removing the previous first element.
           window_sum = (window_sum + nums[j])- nums[j-k];
           max_sum = Math.max(max_sum,window_sum);
        }
        return max_sum;
    }

}

package ArraysTutorialHorizon;

public class MaxSuminSubArray {

    public static void main(String[] args) {
        MaxSuminSubArray ms = new MaxSuminSubArray();
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(ms.maxSum(arr, n, k));
    }

    public int maxSum(int arr[], int n, int k) {
        int maxsum = 0;
        for(int i=0;i<=n-k;i++) {
            int currsum=0;
            for(int j=0;j<k;j++) {
                currsum = currsum + arr[i+j];
            }
            maxsum = Math.max(maxsum, currsum);
        }
       return maxsum;
    }
}

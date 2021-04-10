package ArraysLearning.Leetcode.arrays;

public class CheckifPairsAreDivisibleByk {

    public static void main(String[] args) {
        CheckifPairsAreDivisibleByk ch  = new CheckifPairsAreDivisibleByk();
        int arr[] = {-1,-1,-1,-1,2,2,-2,-2};
        int k = 3;
        boolean res = ch.canArrange(arr, k);
        System.out.println(res);
    }


    public boolean canArrange(int[] arr, int k) {

        int count = 0;
        int max = arr.length/2;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if((arr[i]+arr[j]) >= 0 && ((arr[i]+arr[j]) % k) == 0) {
                    count += 1;
                }
                if(count >= max) {
                    return true;
                }
            }
        }
        return false;
    }
}

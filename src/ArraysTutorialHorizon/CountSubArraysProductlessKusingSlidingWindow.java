package ArraysTutorialHorizon;

public class CountSubArraysProductlessKusingSlidingWindow {

    public static void main(String[] args) {
        int [] nums = {10,4,2,6};
        int K = 100;
        CountSubArraysProductlessKusingSlidingWindow c = new CountSubArraysProductlessKusingSlidingWindow();
        int noofsubarrays = c.get(nums,K);
        System.out.println("The number of subarrays are "+noofsubarrays);

    }

    public int get(int nums[], int k){

        int start = 0;
        int end = 1;
        int count = 0;
        int product = nums[0];
        while(start<=end && end<=nums.length){
            if(product < k){
                count = count+(end-start);
                if(end<nums.length){
                    product = product * nums[end];
                }
                end++;
            }else{
                product = product/nums[start];
                start++;
            }
        }
        return count;
    }
}

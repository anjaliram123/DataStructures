package ArraysTutorialHorizon;

public class SubArraysPorductlessthanKSlidingWindow {

    public static void main(String[] args) {

        SubArraysPorductlessthanKSlidingWindow sbk = new SubArraysPorductlessthanKSlidingWindow();
        int a[] = {10,4,2,6};
        int k =100;
        int noofsubarrays = sbk.countSubArraysProductLessThanK(a,k);
        System.out.println("No.of subarrays whose product less than k are "+noofsubarrays);

    }

    public int countSubArraysProductLessThanK(int nums[], int k) {

        int start = 0;
        int end = 1;
        int count = 0;
        int product = nums[0];

        while(start < end && end <= nums.length){
             if(product < k) {
                 count = count +(end-start);
                 if(end < nums.length)
                 {product = product * nums[end];}
                 end++;
             }
             else {
                 product = product/nums[start++];
             }
        }
        return count;
    }



}

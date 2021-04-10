package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class PermuatationSequence {

    public static void main(String[] args) {
        PermuatationSequence p = new PermuatationSequence();
        String res = p.getPermutation(3, 1);
        System.out.println(res);
    }

    public String getPermutation(int n, int k) {
        StringBuilder sb  = new StringBuilder();
        int nums [] = new int[n];
        int count = 1;

        for(int i=0;i<nums.length;i++) {
            nums[i] = count++;
        }
        if(k == 1) {
            for(int i=0;i<nums.length;i++) {
                sb.append(nums[i]);
            }
            return sb.toString();
        }
        int a [] = new int[n];
        for(int i=1;i<k ;i++){
            a = nextPermute(nums, k);
        }
        for(int i=0;i<a.length;i++) {
            sb.append(a[i]);
        }
        return sb.toString();
    }

    public int[] nextPermute(int nums[], int k) {
        int  i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i>=0) {
            int j = nums.length -1 ;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        return nums;
    }

    public void reverse(int nums[], int i) {
        int j = nums.length-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }


    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

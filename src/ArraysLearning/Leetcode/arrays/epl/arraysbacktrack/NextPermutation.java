package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class NextPermutation {

    public static void main(String[] args) {
        int nums[] = {1,4,3,5,2};
        NextPermutation np = new NextPermutation();
        int res[] = np.nextPermutation(nums);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public int[] nextPermutation(int[] nums) {
        int k = nums.length-2;
        while(k>=0 && nums[k] >= nums[k+1]) {
            k--;
        }

        if( k>= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[k]) {
                j--;
            }
            swap(nums, k, j);
        }
        reverse(nums,k+1);
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

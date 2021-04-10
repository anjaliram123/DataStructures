package ArraysLearning.Leetcode;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
       int nums[]  = {2, 11, 15, 7};
       int target = 9;
       int res [] = t.twoSum(nums, target);
       for(int i=0;i<res.length;i++) {
           System.out.println(res[i]);
       }
    }

    public int[] twoSum(int nums[], int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println("The indices are" +i +" , " +j);
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

package ArraysLearning.Leetcode;

public class RightRotateArrayByHelperArray {

    public static void main(String[] args) {
        RightRotateArrayByHelperArray r = new RightRotateArrayByHelperArray();
        int nums[] = {1,2};
        int k =3;
        r.rotate(nums,k);
    }

    public void rotate(int nums[], int k ){
        int b []= new int[nums.length];
        k = k % nums.length;
        for(int i=0;i<nums.length;i++){
            b[(i+k)%nums.length] = nums[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}

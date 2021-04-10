package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinArray {

    public static void main(String[] args) {
        FindAllNumbersDisappearedinArray f = new FindAllNumbersDisappearedinArray();
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> res = f.findDisappearedNumbers(nums);
        res.forEach(i-> System.out.println(i));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int corr [] = new int[nums.length];
        int count = 1;


        //for each value in nums make the corresponding value in index in corr array  as visited (means negative)
        for(int i=0;i<corr.length;i++) {
            corr[i] = count++;
        }

        for(int i=0;i<nums.length;i++) {
            int newIndex = Math.abs(nums[i])-1;

            if(corr[newIndex] > 0) {
                corr[newIndex] *= -1;
            }
        }

        for(int i=0;i<corr.length;i++) {
            if(corr[i] > 0) {
                res.add(corr[i]);
            }
        }

        return res;
    }
    }

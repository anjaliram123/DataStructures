package ArraysLearning.Leetcode;

public class FindDuplicate {

    public static void main(String[] args) {
        FindDuplicate find = new FindDuplicate();
        int nums[] = {2,5,9,6,9,3,8,9,7,1};
        int val = find.duplicates(nums);
        System.out.println(val);
    }

    public int duplicates(int nums[] ) {
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);


        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;

    }
}

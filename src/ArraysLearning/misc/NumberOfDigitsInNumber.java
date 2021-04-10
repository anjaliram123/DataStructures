package ArraysLearning.misc;

public class NumberOfDigitsInNumber {

    public static void main(String[] args) {

        int[] nums = {437,315,322,431,686,264,442};
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;
            while (number > 0) {
                number = number / 10;
                count = count + 1;
            }

            if (count % 2 == 0) {
                even = even + 1;
            }
        }
        System.out.println("The total numbers are " +even);
    }
}

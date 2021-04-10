package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class sqrt {

    public static void main(String[] args) {
        sqrt s = new sqrt();
        int r = s.sqrt(8);
    }

    public int sqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

}

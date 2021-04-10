package ArraysLearning.Leetcode.arrays.epl;

public class SortArrayByParity2 {

    public static void main(String[] args) {
        SortArrayByParity2 s = new SortArrayByParity2();
        int A [] = {4,2,5,7};
        int res [] = s.sortArrayByParityII(A);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

}

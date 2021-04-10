package ArraysLearning.Leetcode.BitOperations;

public class SortArrayBy1s {

    public static void main(String[] args) {
        SortArrayBy1s sortArrayBy1s = new SortArrayBy1s();
        int arr [] = {0,1,2,3,4,5,6,7,8};
        int [] onesArray = sortArrayBy1s.sortByBits(arr);
        for (int i : onesArray) {
            System.out.print(i+" , ");
        }
    }

    public int[] sortByBits(int[] arr) {
        int [] onesArray = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            int count  = 0;
            while(num > 0) {
                if((num&1) == 1)
                {
                    count = count +1;
                }
                num >>= 1;
            }
            onesArray[i]=count;
        }
        return onesArray;

    }
}


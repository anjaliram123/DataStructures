package ArraysLearning.Leetcode.thirtydaychallenge;

import java.util.Arrays;
import java.util.HashSet;

public class CountingElements {

    public static void main(String[] args) {
        CountingElements ce = new CountingElements();
        int a [] = {1,1,2,2};
        int count = ce.countElements(a);
        System.out.println(count);
    }

    public int countElements(int[] arr) {
        if(arr==null || arr.length==0 || arr.length == 1) {
            return 0;
        }
        HashSet<Integer> hashset = new HashSet<>();
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            hashset.add(arr[i]);
        }

        for(int value :arr) {
            if(hashset.contains(value+1)){
                count = count +1;
            }
        }
        return count;
    }

}

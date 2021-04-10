package stacks;

import java.util.*;

public class SubArrayMinimumStackTBD {

    public static void main(String[] args) {
        SubArrayMinimumStackTBD s = new SubArrayMinimumStackTBD();
        int arr[] = {71,55,82,55};
        int minSum = s.subsets(arr);
        System.out.println(minSum);
    }

    public int subsets(int[] arr) {
        List<List<Integer>> output = new ArrayList<>();
        int k = 1;
        while(k<arr.length+1) {
            backtrack(0,new ArrayList<Integer>(), arr, output, k);
            k++;
        }
        Iterator<List<Integer>> itr = output.iterator();
        int sum = 0;
        while(itr.hasNext()) {
            int  min = Integer.MAX_VALUE;
            List<Integer> li = itr.next();
            for(int i=0;i<li.size();i++) {
                if(li.get(i) < min) {
                    min = li.get(i);
                }
            }
            sum = sum+min;
        }
        return sum;
    }

    public void backtrack(int curr, List<Integer> li , int arr[], List<List<Integer>> output, int k) {
        if(li.size() == k) {
            output.add(new ArrayList<>(li));
            return;
        }
            int i = curr;
            li.add(arr[i]);
            backtrack(i + 1, li, arr, output, k);
            li.remove(0);
    }

    public boolean noDuplicates(int arr[], int i, int j) {
        for(int k = j; k<i;k++) {
            if(arr[k]==arr[i]) {
                return false;
            }
        }
        return true;
    }
}

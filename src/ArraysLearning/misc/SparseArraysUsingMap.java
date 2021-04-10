package ArraysLearning.misc;

import java.util.HashMap;

public class SparseArraysUsingMap {

    public static void main(String[] args) {
        SparseArraysUsingMap smp = new SparseArraysUsingMap();
        String ss [] = {"aba", "baba", "aba", "xzxb"};
        String qq [] = {"aba","xzxb","ab"};
        int [] a = smp.getCount(ss,qq);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public int[] getCount(String [] strings, String[] queries) {
        int len = queries.length;
        int arr[] = new int[len];
        int k = 0;
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<strings.length;i++) {
            if(map.containsKey(strings[i])){
                int val = map.get(strings[i]);
                val++;
                map.put(strings[i], val);
            } else {
                map.put(strings[i],1);
            }
        }
        for(int i=0;i<queries.length;i++) {
            if(map.containsKey(queries[i])) {
                int val = map.get(queries[i]);
                arr[k]=val;
            } else {
                arr[k]=0;
            }
            k++;
        }
        return arr;
    }
}

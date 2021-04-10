package ArraysLearning.Leetcode.PriorityQueue;

import java.util.Arrays;

public class FrequencySortFaster {

    public static void main(String[] args) {
        FrequencySortFaster f = new FrequencySortFaster();
        String res = f.frequencySort("Aabb");
        System.out.println(res);
    }

    public String frequencySort(String s) {
        if(s== null || s.isEmpty()) {
            return s;
        }
        int arr[] = new int[256];
        for(char c: s.toCharArray()) {
            arr[c] = arr[c]+1;
        }

        Integer[] index = new Integer[256];
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index ,(a,b)-> arr[b] - arr[a]);
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<index.length;i++) {
            int cnt = arr[index[i]];
            char c = (char) (int) (index[i]);
            while(cnt > 0) {
                sb.append(c);
                cnt--;
            }
        }

        return sb.toString();
    }

}

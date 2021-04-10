package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingIntervals {

    public static void main(String[] args) {
        MergingIntervals merging = new MergingIntervals();
        int [][] intervals = {{9,10},{4,9},{4,17}};
        int [][] res = merging.merge(intervals);
        for(int i=0;i<res.length;i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[] > mergedIntervals = new ArrayList<>();

        int [] prevInterval = intervals[0];
        mergedIntervals.add(prevInterval);

        for(int[] currInterval : intervals) {
            if(currInterval[0] <= prevInterval[1]) {
                prevInterval[1] = Math.max(currInterval[1], prevInterval[1]);
            } else {
                prevInterval = currInterval;
                mergedIntervals.add(currInterval);
            }
        }
       return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

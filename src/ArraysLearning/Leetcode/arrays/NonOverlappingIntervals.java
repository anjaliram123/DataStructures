package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int [][] intervals = {{1,2},{2,3}};
        int res = nonOverlappingIntervals.eraseOverlapIntervals(intervals);
        System.out.println(res);
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return 0;
        }
        int overlapCount = 0;
        int nonOverlapCount = 0;
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> mergedlist = new ArrayList<>();
        int[] prevInterval = intervals[0];
        mergedlist.add(prevInterval);

        for(int [] currinterval : intervals) {
            if(currinterval[0] < prevInterval[1]){
                //overlapping exists
                prevInterval[1] = Math.min(prevInterval[1], currinterval[1]);
                overlapCount = overlapCount + 1;
            } else {
                prevInterval = currinterval;
               // mergedlist.add(currinterval);
                nonOverlapCount = nonOverlapCount + 1;
            }
        }

        return overlapCount > 0 ? overlapCount-1:overlapCount;
    }
}

package ArraysLearning.Leetcode.arrays;

import java.util.Arrays;

public class MeetingRoomsTwopointer {

    public static void main(String[] args) {
        MeetingRoomsTwopointer meetingRoomsTwopointer = new MeetingRoomsTwopointer();
        int intervals[][] =  {{9,10},{4,9},{4,17}};
        int minMeetingRooms = meetingRoomsTwopointer.minMeetingRooms(intervals);
        System.out.println("Min meeting rooms "+minMeetingRooms);
    }

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];

        for(int i=0;i<intervals.length;i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start, (a,b)-> Integer.compare(a,b));

        Arrays.sort(end, (a,b)-> Integer.compare(a,b));

        int startpointer = 0;
        int endpointer = 0;
        int usedCount = 0;
         while(startpointer < start.length) {
             if(start[startpointer] >= end[endpointer]) {
                 usedCount = usedCount-1;
                 endpointer++;
             }
             usedCount=usedCount+1;
             startpointer++;
         }

        return usedCount;
    }
}

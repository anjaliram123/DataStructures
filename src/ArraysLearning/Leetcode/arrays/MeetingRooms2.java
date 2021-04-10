package ArraysLearning.Leetcode.arrays;

import java.util.*;

public class MeetingRooms2 {

    public static void main(String[] args) {
        MeetingRooms2 m = new MeetingRooms2();
        int intervals[][] =  {{9,10},{4,9},{4,17}};
        int minMeetingRooms = m.minMeetingRooms(intervals);
        System.out.println(minMeetingRooms);

    }

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        //Adding end times for each meeting
        //when we do we don't require new meeting room if next intervals starttime is greater than or equal to current interval in the heap end time.
        //for example if heap has endtime 9 belonging to (4,9)the next meeting start time is 9 belonging to (9,10) - so we do not require a meeting room
        PriorityQueue<Integer> allocator = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        //add the first end time in minheap
        allocator.add(intervals[0][1]);

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] >= allocator.peek()){
                allocator.poll();
            }
            allocator.add(intervals[i][1]);
        }
        return allocator.size();
    }
}

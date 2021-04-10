package ArraysLearning.Leetcode.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeFreeTimeOptimized {

    public static void main(String[] args) {
        EmployeeFreeTimeOptimized empt  = new EmployeeFreeTimeOptimized();
        Interval2 i = new Interval2(1,3);
        Interval2 i1 = new Interval2(6,7);
        Interval2 i2 = new Interval2(2,4);
        Interval2 i3 = new Interval2(2,5);
        Interval2 i4 = new Interval2(9,12);

        List<Interval2> li = new ArrayList<>();
        li.add(i);li.add(i1);li.add(i2);li.add(i3);li.add(i4);
        List<List<Interval2>> intervals  = new ArrayList<>();
        intervals.add(li);
        List<Interval2> res = empt.employeeFreeTime(intervals);
        for(Interval2 interval : res){
            System.out.println(interval.start);
            System.out.println(interval.end);
        }
    }

    public List<Interval2> employeeFreeTime(List<List<Interval2>> schedule) {
        List<Interval2> resultList = new ArrayList<>();
        List<Interval2> all = new ArrayList<>();
        for(List<Interval2> interval : schedule) {
            all.addAll(interval);
        }
        Collections.sort(all, new Comparator<Interval2>() {
            @Override
            public int compare(Interval2 o1, Interval2 o2) {
                return o1.start-o2.start;
            }
        });
        int end = all.get(0).end;
        for(Interval2 x : all) {
            if(x.start > end) {
                resultList.add(new Interval2(end,x.start));
            }
            end = Math.max(end,x.end);
        }

        return resultList;
    }

}

class Interval2 {
    public int start;
    public int end;

    public Interval2() {
    }

    public Interval2(int _start, int _end) {
        start = _start;
        end = _end;
    }
}

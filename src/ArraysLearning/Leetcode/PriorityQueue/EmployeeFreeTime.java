package ArraysLearning.Leetcode.PriorityQueue;

import java.util.*;

public class EmployeeFreeTime {

    public static void main(String[] args) {
        EmployeeFreeTime empt  = new EmployeeFreeTime();
        Interval i = new Interval(1,3);
        Interval i1 = new Interval(6,7);
        Interval i2 = new Interval(2,4);
        Interval i3 = new Interval(2,5);
        Interval i4 = new Interval(9,12);

        List<Interval> li = new ArrayList<>();
        li.add(i);li.add(i1);li.add(i2);li.add(i3);li.add(i4);
        List<List<Interval>> intervals  = new ArrayList<>();
        intervals.add(li);
        List<Interval> res = empt.employeeFreeTime(intervals);
        for(Interval interval : res){
            System.out.println(interval.start);
            System.out.println(interval.end);
        }

    }

    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> resultList = new ArrayList<>();

        schedule.forEach(iList -> iList.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return  o1.start - o2.start;
            }
        }));

        PriorityQueue<Integer> maxpq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

       maxpq.add(schedule.get(0).get(0).end);
       for(int i=0;i<schedule.size();i++) {
           for(int j=1; j<schedule.get(i).size(); j++) {
               if (schedule.get(i).get(j).start > maxpq.peek()) {
                   int start = maxpq.peek();
                   int end = schedule.get(i).get(j).start;
                   Interval it = new Interval(start, end);
                   resultList.add(it);
               }
               maxpq.poll();
               maxpq.add(schedule.get(i).get(j).end);
           }
       }
       return resultList;

    }
}

class Interval{
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
}

package ArraysLearning.Leetcode.PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PQJavaMax {


    PriorityQueue<Integer> pq;

    public PQJavaMax () {
        pq = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o2.intValue() == o1.intValue()) {
                   return 0;
               }
               if(o2 > o1) {
                   return 1;
               }
               return -1;
            }
        });
    }

    public void insert(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            pq.offer(arr[i]);
        }
    }

    public Integer peek() {
        if(!pq.isEmpty()) {
            return pq.peek();
        }
        return 0;
    }

    public Integer poll() {
        if(!pq.isEmpty()) {
            return pq.poll();
        }
        return null;
    }

    public boolean contains(int key) {
        if(!pq.isEmpty()) {
            if(pq.contains(key)){
                return true;
            }
            return false;
        }
        return false;
    }

    public void display() {
        Iterator itr = pq.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        PQJavaMax p = new PQJavaMax();
        int arr[] = {3, 6, 5, 8, 1, 3, 4,29,81,67,54,23,90,12};
        p.insert(arr);
        p.display();
        p.poll();
        System.out.println("---------------------------------");
        p.display();
    }


}

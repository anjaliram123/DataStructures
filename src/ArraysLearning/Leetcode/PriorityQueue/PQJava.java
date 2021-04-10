package ArraysLearning.Leetcode.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQJava {

    PriorityQueue<Integer> pq;

    public PQJava () {
        pq = new PriorityQueue<>();
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
        PQJava p = new PQJava();
        int arr[] = {3, 6, 5, 8, 1, 3, 4};
        p.insert(arr);
        p.display();
        p.poll();
        System.out.println("---------------------------------");
        p.display();
    }
}

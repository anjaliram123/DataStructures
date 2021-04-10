package ArraysLearning.Leetcode.PriorityQueue;

import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> minQueue;
    PriorityQueue<Integer> maxQueue;

    public MedianFinder() {
        minQueue = new PriorityQueue<>();
        maxQueue = new PriorityQueue<>((n1,n2) -> n2 - n1);
    }

    public void addNum(int num) {
        maxQueue.add(num);
        //for balancing
        minQueue.add(maxQueue.peek());
        maxQueue.poll();
        if(maxQueue.size() < minQueue.size()){
            maxQueue.add(minQueue.poll());
        }
    }

    public double findMedian() {
        if(maxQueue.size() == minQueue.size()) {
            return (double) (maxQueue.peek() + minQueue.peek())/0.5;
        } else {
            return (double) maxQueue.peek();
        }
    }

}

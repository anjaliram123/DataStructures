package ArraysLearning.Leetcode.PriorityQueue;

public class MaxRevenuebySellingtickets {

    private int mh[];
    private int capacity;
    private int currentSize;

    public MaxRevenuebySellingtickets(int capacity) {
        this.capacity = capacity;
        mh = new int[capacity + 1];
        this.currentSize = 0;
    }

    public void createHeap(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
    }

    public void insert(int key) {
        if(currentSize == capacity) {
            try{
                throw new Exception("Heap is full - cannot insert");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        currentSize++;
        int idx = currentSize;
        mh[idx] = key;
        swim(idx);
    }

    public void swim(int idx) {
        int curr = idx;
        int parent = idx/2;
        while(curr > 1 && mh[parent] < mh[curr]) {
            swap(curr,parent);
            curr = parent;
            parent = parent/2;
        }
    }

    public void swap(int curr, int parent) {
        int temp = mh[curr];
        mh[curr] = mh[parent];
        mh[parent]= temp;
    }

    public int getMaxRevenue(int tickets) {
        int maxRevenue = 0;
        while(tickets > 0) {
            int max = mh[1];
            maxRevenue = maxRevenue + max;
            deleteMax();
            insert(max-1);
            tickets--;
        }
        return maxRevenue;
    }

    public int deleteMax() {
        int max = mh[1];
        mh[1] = mh[currentSize];
        mh[currentSize] = 0;
        sink(1);
        currentSize--;
        return max;
    }

    public void sink(int index) {
        int largest = index;
        int leftChildIndex = index*2;
        int rightChildIndex = index*2 + 1;
        if(leftChildIndex < heapSize() && mh[leftChildIndex] > mh[largest]) {
            largest = leftChildIndex;
        }

        if(rightChildIndex < heapSize() && mh[rightChildIndex] > mh[largest]) {
            largest = rightChildIndex;
        }

        if(largest != index) {
            swap(largest, index);
            sink(largest);
        }


    }

    public int heapSize() {
        return currentSize;
    }

    public static void main(String[] args) {
        int arr [] = { 5, 1, 7, 10, 11, 9 };
        System.out.println();
        MaxRevenuebySellingtickets bi = new MaxRevenuebySellingtickets(arr.length);
        bi.createHeap(arr);
        System.out.println("Get maxRevenue");
        System.out.println(bi.getMaxRevenue(5));
    }
}

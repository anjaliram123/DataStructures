package ArraysLearning.Leetcode.PriorityQueue;

public class KthLargestElementinArray {

    private int mh[];
    private int capacity;
    private int currentSize;

    public KthLargestElementinArray(int capacity) {
        this.capacity = capacity;
        mh = new int[capacity+1];
        currentSize = 0;
    }

    public int create(int arr[], int k) {
        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
        for(int i=1;i<k;i++) {
            deleteMax();
        }
        return deleteMax();
    }

    public void insert(int key) {
        if(currentSize == capacity) {
            try{
                throw new Exception("Heap is full");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        currentSize++;
        int indx = currentSize;
        mh[indx] = key;
        swim(indx);
    }

    public void swim(int idx) {
        int curr = idx;
        int parent = idx/2;
        while(curr > 1 && mh[parent] < mh[curr]) {
            swap(curr, parent);
            curr = parent;
            parent = parent/2;
        }
    }

    public int deleteMax() {
        if(isempty()) {
            try{
                throw new Exception("Heap is empty - cant delete");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        int max = mh[1];
        mh[1] = mh[currentSize];
        mh[currentSize] = 0;
        sink(1);
        currentSize--;
        return max;
    }

    public void sink(int idx) {
        int largest = idx;
        int leftChildIndx = 2*idx;
        int rightChildIndx = 2*idx + 1;
        if(leftChildIndx < getSize() && mh[leftChildIndx] > mh[largest]) {
            largest = leftChildIndx;
        }
        if(rightChildIndx < getSize() && mh[rightChildIndx] > mh[largest]) {
            largest = rightChildIndx;
        }

        if(largest != idx) {
            swap(largest, idx);
            sink(largest);
        }
    }

    public boolean isempty() {
        return currentSize==0;
    }

    public void swap(int curr, int parent) {
        int temp = mh[curr];
        mh[curr] = mh[parent];
        mh[parent] = temp;

    }

    public int getSize() {
        return currentSize;
    }


    public static void main(String[] args) {
        int arr [] = {3,2,3,1,2,4,5,5,6};
        KthLargestElementinArray kthLargestElementinArray= new KthLargestElementinArray(arr.length);
        System.out.println(kthLargestElementinArray.create(arr, 4));

    }
}

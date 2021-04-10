package ArraysLearning.Leetcode.PriorityQueue;

public class BinaryMinHeap {

    public int capacity;
    public int[] mH;
    public int currentSize;

    public BinaryMinHeap(int capacity) {
        this.capacity = capacity;
        mH = new int[capacity + 1];
        currentSize = 0;
    }

    public void display() {
        for(int i=1;i<mH.length;i++) {
            System.out.print(" "+mH[i]);
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int heapSize(){
        return currentSize;
    }

    private void createHeap(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
    }

    private void insert(int key) {
        if(currentSize==capacity){
            try {
                throw new Exception("Heap is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        currentSize++;
        int ind = currentSize;
        mH[ind] = key;
        swim(ind);
    }

    private void swim(int idx) {
        int parentIndex = idx/2;
        int currIndex = idx;
        while(currIndex > 0 && mH[parentIndex] > mH[currIndex]) {
            swap(currIndex,parentIndex);
            currIndex = parentIndex;
            parentIndex = parentIndex/2;
        }
    }

    private int deleteMin() {
        int min = mH[1];
        mH[1] = mH[currentSize];
        mH[currentSize] = 0;
        sink(1);
        currentSize--;
        return min;
    }

    private void sink(int idx) {
        int smallest =  idx ;
        int leftChildIndex = 2*idx;
        int rightChildIndex =  2*idx + 1;
        if(leftChildIndex < heapSize() && mH[leftChildIndex] < mH[smallest]) {
            smallest = leftChildIndex;
        }

        if(rightChildIndex < heapSize() && mH[rightChildIndex] < mH[smallest]) {
            smallest = rightChildIndex;
        }

        if(smallest != idx) {
            swap(smallest, idx);
            sink(smallest);
        }
    }

    private void swap(int curr, int parent) {
        int temp = mH[curr];
        mH[curr] = mH[parent];
        mH[parent] = temp;
    }

    public static void main(String[] args) {
        int arr [] = {3,2,1,7,8,4,10,16,12};
        System.out.print("Original Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("  " + arr[i]);
        }
        System.out.println();
        BinaryMinHeap bi = new BinaryMinHeap(arr.length);
        bi.createHeap(arr);
        bi.display();
        System.out.println("Extract Min");
        for(int i=0;i<arr.length;i++){
            System.out.print("  " + bi.deleteMin());
        }

    }

}

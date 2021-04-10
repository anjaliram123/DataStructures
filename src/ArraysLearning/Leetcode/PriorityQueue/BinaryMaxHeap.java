package ArraysLearning.Leetcode.PriorityQueue;

public class BinaryMaxHeap {


    private int mH[];
    private int capacity;
    private int currentSize;

    public BinaryMaxHeap(int capacity) {
        this.capacity = capacity;
        mH = new int[capacity + 1];
        currentSize = 0;
    }

    public void createHeap(int arr[]){
        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
    }
    public void insert(int key) {
        if(currentSize == capacity) {
            try {
                throw new Exception("Heap is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int index = currentSize;
        currentSize++;
        mH[index] = key;
        swim(index);
    }

    public void swim(int index) {
        int parentIndex = index/2;
        int currentIndex = index;
        //here we are looking for currentIndex > 1 since we if currentIndex is '0' we have nothing else to compare
        while(currentIndex > 1 && mH[parentIndex] < mH[currentIndex]) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = parentIndex/2;
        }
    }

    public int deleteMax() {
        int max = mH[1];
        mH[1] = mH[currentSize];
        mH[currentSize] = 0;
        sink(1);
        currentSize--;
        return max;
    }

    public void sink(int index) {
        int largest = index;
        int leftChildIndex = index*2;
        int rightChildIndex = index*2 + 1;
        if(leftChildIndex < heapSize() && mH[leftChildIndex] > mH[largest]) {
            largest = leftChildIndex;
        }

        if(rightChildIndex < heapSize() && mH[rightChildIndex] > mH[largest]) {
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

    public void swap(int curr, int parent) {
        int temp = mH[curr];
        mH[curr] = mH[parent];
        mH[parent] = temp;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void display() {
        for(int i=0;i<mH.length;i++) {
            System.out.print(" "+mH[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {3,2,1,7,8,4,10,16,12};
        System.out.print("Original Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("  " + arr[i]);
        }
        System.out.println();
        BinaryMaxHeap bi = new BinaryMaxHeap(arr.length);
        bi.createHeap(arr);
        bi.display();
        System.out.println("Extract Min");
        for(int i=0;i<arr.length;i++){
            System.out.print("  " + bi.deleteMax());
        }

    }

}


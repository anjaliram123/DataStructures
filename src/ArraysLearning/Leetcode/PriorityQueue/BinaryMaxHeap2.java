package ArraysLearning.Leetcode.PriorityQueue;

public class BinaryMaxHeap2 <T extends Object> {

    Integer pq[];
    int capacity;
    int currentSize;

    public BinaryMaxHeap2(int k) {
        this.capacity = k;
        this.currentSize = 0;
        this.pq = new Integer[k+1];
    }

    public void createHeap(int pq[]) {
        for(int i=0;i<pq.length;i++) {
            insert(pq[i]);
        }
    }

    public void insert(int val) {
        if(currentSize == capacity) {
            try {
                throw new Exception("Heap is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        currentSize++;
        int index = currentSize;
        //we insert values from index - 1 here because while sinking down and finding children
        // if index is 0 then leftchild index will also be 0 because we look for 2*index
        //so for convenience purpose we start from index '1'
        pq[currentSize] = val;
        swim(index);
    }

    public void swim(int k) {
        int parent = k/2;
        int current = k;
        while(current > 1 && pq[current] > pq[parent]) {
            swap(current, parent);
            current = parent;
            parent = current/2;
        }
    }

    public void swap(int curr, int parent) {
        int temp = pq[curr];
        pq[curr] = pq[parent];
        pq[parent] = temp;
    }

    public int deleteMax() {
        if(currentSize == 0) {
            try {
                throw new Exception("Heap is Empty cannot delete");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int max = pq[1];
        pq[1] = pq[currentSize];
        pq[currentSize] = 0;
        sink(1);
        currentSize--;
        return max;
    }

    public void sink(int k) {
        int largest = k;
        int leftChildIndex = k*2;
        int rightChildIndex = k*2 + 1;
        if(leftChildIndex < currentSize && pq[leftChildIndex] > pq[largest]) {
            largest = leftChildIndex;
        }

        if(rightChildIndex < currentSize && pq[rightChildIndex] > pq[largest]) {
            largest = rightChildIndex;
        }

        if(largest != k) {
            swap(largest, k);
            sink(largest);
        }
    }



    public void display() {
        for(int i=1;i<pq.length;i++) {
            System.out.print(" "+pq[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
       int arr [] = {3,2,2,7,8,4,10,16,12};
        BinaryMaxHeap2 bh = new BinaryMaxHeap2(arr.length);
        bh.createHeap(arr);
        System.out.println("aFter max heap created");
        bh.display();
        System.out.println();
        System.out.println(bh.deleteMax());
        System.out.println("After one deletion");
        bh.display();
    }


}

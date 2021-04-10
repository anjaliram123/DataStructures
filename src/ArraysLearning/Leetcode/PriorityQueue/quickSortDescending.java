package ArraysLearning.Leetcode.PriorityQueue;

public class quickSortDescending {

    public static void main(String[] args) {
        quickSortDescending qd = new quickSortDescending();
        int arr[] = {10,80,30,90,40,50,70};
        qd.sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public void sort(int arr[], int low, int high) {
        if(low == high) {
            return;
        }
        if(low < high) {
            int p = partition(arr, low , high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }

    public int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        for(int j = low+1; j <= high; j++){
            if (arr[j] > pivot){
                i = i+1;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

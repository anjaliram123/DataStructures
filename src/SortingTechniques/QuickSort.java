package SortingTechniques;

//selecting pivot as last element in array
public class QuickSort {

    public static void main(String[] args) {
        int arr [] = { 10, 80, 30, 90, 40, 50, 70};
        QuickSort q = new QuickSort();
        q.sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }

    }

    public void sort(int arr[], int low, int high) {
        if(low < high) {
            int p = partition(arr, low, high);
            sort(arr, low,p-1);
            sort(arr,p+1,high);
        }
    }

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package ArraysLearning.Leetcode.PriorityQueue;

public class quickSortdifferentway {

    public static void main(String[] args) {
        quickSortdifferentway d =  new quickSortdifferentway();
        int arr[] = {10,80,30,90,40,50,70};
        d.sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public void sort(int arr[], int low, int high) {
        if(low==high) {
            return;
        }
        if(low < high){
            int p = partition(arr, low, high);
            sort(arr, low,p-1);
            sort(arr, p+1, high);
        }
    }

    public int partition(int arr[], int low, int high) {
        int i = low; int j=high+1;
        while(true) {
            while(arr[++i] < arr[low]){
                if(i == high){
                    break;
                }
            }

            while(arr[--j] > arr[low]) {
                if(j == low) {
                    break;
                }
            }
            if(i>=j) {
                break;
            }
            swap(arr,i,j);
        }
        swap(arr, low, j);
        return j;
    }


    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

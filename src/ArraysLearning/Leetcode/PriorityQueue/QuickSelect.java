package ArraysLearning.Leetcode.PriorityQueue;

public class QuickSelect {

    public static void main(String[] args) {
        QuickSelect d =  new QuickSelect();
        int arr[] = {10,80,30,90,40,50,70,20,14,32};
        //k==5 indicates all elements before index 5 ar lesser and all elemenets after index 5 are greater
        d.sort(arr, 0, arr.length-1, 5);
        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public void sort(int arr[], int low, int high, int K) {
        if(low==high) {
            return;
        }
        if(low < high) {
            int p = partition(arr, low, high);
            if(p == K){
                return ;
            } else if(p > K){
                sort(arr, low, p-1,K);
            } else {
                sort(arr, p+1, high,K);
            }

        }
    }

    public int partition(int arr[], int low, int high) {
        int i = low; int j = high+1;
        while(true){
            while(arr[++i] < arr[low]){
                if(i == high) {
                    break;
                }
            }
            while(arr[--j] > arr[low]) {
                if(j==low) {
                    break;
                }
            }
            if(i>=j) {
                break;
            }
            swap(arr, i, j);
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

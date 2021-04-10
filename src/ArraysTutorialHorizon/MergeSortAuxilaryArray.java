package ArraysTutorialHorizon;

import java.util.Arrays;

public class MergeSortAuxilaryArray {

    private int arrSize;
    private int[] arrAux;
    private int[] arrInput;

    public MergeSortAuxilaryArray(int [] arrInput){
        this.arrInput = arrInput;
        arrSize = arrInput.length;
        arrAux = new int[arrSize];
    }

    public void sort(int low, int high)
    {
        if(low<high) {
            int mid = low + (high - low) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public void merge(int low, int mid, int high){
        for(int i=low;i<=high;i++){
            arrAux[i]=arrInput[i];
        }

        int i=low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<=high) {
            if(arrAux[i]<=arrAux[j]){
                arrInput[k]=arrAux[i];
                i++;
            }else{
                arrInput[k]=arrAux[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            arrInput[k]=arrAux[i];
            i++;
            k++;
        }

        while(j<=high){
            arrInput[k]=arrAux[j];
            j++;
            k++;
        }
    }

    public void printArray(int a[]){
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[]={12,11,13,5,6,7};
        MergeSortAuxilaryArray m = new MergeSortAuxilaryArray(a);
        m.sort(0,a.length-1);
        m.printArray(a);

    }
}

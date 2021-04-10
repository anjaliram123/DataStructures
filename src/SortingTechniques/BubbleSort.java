package SortingTechniques;

public class BubbleSort {

    public static void main(String[] args) {

        int a[] = {32, 45, 12, 67, -22, 15, 1};
        int temp=0;
        for(int j=a.length-1;j>=0;j--){
            for(int i=0;i<a.length-1;i++){
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}

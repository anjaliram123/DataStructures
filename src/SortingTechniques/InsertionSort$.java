package SortingTechniques;

public class InsertionSort$ {

    public static void main(String[] args) {

        int a[] = {32, -2, 12, 67, -22, -15, 1};

        for(int j=1;j<a.length;j++)
        {
            int key=a[j];
            int i=j-1;
            while(i>=0 && a[i]>key) {
                a[i+1] = a[i];
                i=i-1;
                a[i+1] = key;
                }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }
}

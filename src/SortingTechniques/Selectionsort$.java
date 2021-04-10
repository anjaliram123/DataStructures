package SortingTechniques;

public class Selectionsort$ {


    public static void main(String[] args) {


        int a[] = {32, 45, 12, 67, -22, -15, 1};

        int large =0;
        int temp=0;
        for (int i=0;i<a.length;i++)
        {
            large=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[large])
                {
                    large=j;
                }
            }
            temp=a[i];
            a[i]=a[large];
            a[large]=temp;

        }


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

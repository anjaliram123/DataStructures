package ArraysLearning.Sorting;

public class Selectionsort {

    public static void main(String[] args) {
        int a[]={21,45,2,31,78,12};

        for(int lastunsortedindex=a.length-1;lastunsortedindex>0;lastunsortedindex--)
        {
            int largest=0;
            for(int index=1;index<=lastunsortedindex;index++)
            {
                if(a[index]>a[largest])
                {
                    largest=index;

                }
            }
            int temp=0;
            temp=a[largest];
            a[largest]=a[lastunsortedindex];
            a[lastunsortedindex]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

package ArraysLearning.misc;

public class Selectionsort$ {

    public static void main(String[] args) {

        int a[] = {21, 4, 56, 34, 89};

      for(int i=0;i<a.length;i++)
      {
          int largest=i;
          for(int j=i+1;j<a.length;j++) {
              if (a[j] > a[largest]) {
                  largest= j;
              }
          }
              int temp = 0;
              temp = a[largest];
              a[largest] = a[i];
              a[i] = temp;

      }

     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]);
     }

    }
}

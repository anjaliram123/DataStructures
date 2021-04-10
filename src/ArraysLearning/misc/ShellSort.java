package ArraysLearning.misc;

public class ShellSort {

    //it is a imporoved way of insertion sort
    //it uses gap of some value instead of comparing each adjacent element
    //it does some preliminary work before doing the insertion sort(it also does insertion sort at end)
    //for shell sort the final iteration needs to always have gap of 1

    public static void main(String[] args) {
        int a[] = {32, 45, 12, 2, 54, 21,87,18,31};

        for(int gap=a.length/2;gap>0;gap= gap/2)
        {

            for(int i=gap;i<a.length;i++)
            {
                int key=a[i];
                int j=i;
                while(j>=gap &&a[j-gap]>key)
                {
                    a[j]=a[j-gap];
                    j=j-gap;
                    a[j]=key;
                }
                //a[j]=key;
            }



        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

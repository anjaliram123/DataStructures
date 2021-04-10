package ArraysLearning.misc;

public class Shellsort$ {

    public static void main(String[] args) {

        int a[]={20,35,-15,7,55,1,-22};

        for(int gap=a.length/2;gap>0;gap=gap/2)
        {

            for(int i=gap;i<a.length;i++)
            {
                int j=i;
                int key=a[i];
                while(j>=gap && a[j-gap]>key)
                {
                    a[j]=a[j-gap];
                    j=j-gap;
                    a[j]=key;
                }
            } }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

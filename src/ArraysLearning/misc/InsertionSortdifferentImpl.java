package ArraysLearning.misc;

public class InsertionSortdifferentImpl {

    public static void main(String[] args) {

        int a[]={23,12,45,2,34,21};

        for(int j=1;j<a.length;j++)
        {
            int key=a[j];
            int i;
            for( i=j-1;i>=0&&a[i]>key;i--)
            {
                a[i+1]=a[i];
            }

           a[i+1]=key;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

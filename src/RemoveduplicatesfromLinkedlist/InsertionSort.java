package RemoveduplicatesfromLinkedlist;

public class InsertionSort {


    public static void main(String[] args) {
        int a[]={5,4,65,21};

        for(int j=1;j<a.length;j++)
        {
            int i=j-1;
            int key=a[j];
            //System.out.println(key);
            //System.out.println(a[j]);
            while(i>=0 && a[i]>key)
            {

                    a[i+1]=a[i];
                    i=i-1;
                    a[i+1]=key;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

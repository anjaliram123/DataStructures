package LinkedlistsRemovefromUnsorted;

public class Insertionsort {

    static int a[]={23,12,4,65,78,21};

    public static void main(String[] args) {

        for(int j=1;j<a.length;j++)
        {
            int i=j-1;
          int key;
          key=a[j];//key=12

            while(i>=0 && a[i]>key )
            {
               a[i+1]=a[i];
               i=i-1;
               a[i+1]=key;
            }

        }

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);

        }


    }

}

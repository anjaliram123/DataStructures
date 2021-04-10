package Practice;

public class Insertionsortprc$ {

    static int a[]={23,4,12,73,2,90};

    public static void main(String[] args) {

        for(int j=1;j<a.length;j++)
        {
            int key=a[j];
            int i=j-1;
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

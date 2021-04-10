package Practice;

public class BubbleSortprc$ {


    public static void main(String[] args) {

        int a[]={23,45,12,73,2,90};

        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }


    }
}

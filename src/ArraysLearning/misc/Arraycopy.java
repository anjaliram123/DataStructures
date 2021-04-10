package ArraysLearning.misc;

public class Arraycopy {

    public static void main(String[] args) {

        int a[]={21,34,2,31,45};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b=a;
            System.out.println(b[i]);
        }



    }
}

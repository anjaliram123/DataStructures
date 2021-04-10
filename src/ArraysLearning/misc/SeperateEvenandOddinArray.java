package ArraysLearning.misc;

public class SeperateEvenandOddinArray {

    public static void main(String[] args) {

        int a[]={12,23,34,53,61,72};
//Reversing an array
//        int left=0;int right=a.length-1;
//        int temp=0;
//
//            while(left<=right) {
//                 temp=a[left];
//                a[left] = a[right];
//                a[right] = temp;
//                left++;
//                right--;
//            }


        //Seperate even and odd in array
//        int j=-1;
//        int tmp=0;
//
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]%2==0)
//            {
//                j++;
//
//                tmp=a[i];
//                a[i]=a[j];
//                a[j]=tmp;}
//        }
//
//            for(int i=0;i<a.length;i++) {
//            System.out.println(a[i]);
//
//        }


        //remove duplicates in array

        int b[]={32,45,65,45,32,12};
        int c[]=new int[b.length];

        for(int i=0;i<b.length;i++)
        {
            int j= 1;

            while(j>i)
            {
                if(b[i]==b[j])
                {

                }
            }
        }

        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
            }
        }


}

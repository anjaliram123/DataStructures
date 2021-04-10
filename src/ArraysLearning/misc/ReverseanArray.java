package ArraysLearning.misc;

public class ReverseanArray {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5};

//       int left=0;
//       int right=a.length-1;
//       int temp;
//       while(left<right)
//       {
//           temp=a[left];
//           a[left]=a[right];
//           a[right]=temp;
//           left++;
//           right--;
//       }

        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }

       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
    }
}

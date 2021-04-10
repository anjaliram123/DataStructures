package RemoveduplicatesfromLinkedlist;

public class MergesortMain {

    static int a[]={34,21,65,43,89,76};
    public static void main(String[] args) {

        MergesortMain m=new MergesortMain();
        m.mergesort(a);

    }

    public  void merge(int a[],int L[],int R[])
    {  int i=0;int j=0; int k=0;
        int nL=L.length;
        int nR=R.length;

        while(L[i]<nL && R[j]<nR)
        {
             if(L[i]<=R[j])
             {
                 a[k]=L[i];
                 i=i+1;
             }
             else if(L[i]>=R[j])
             {
                 a[k]=R[j];
                 j=j+1;
             }
             k=k+1;
        }

        while(i<nL)
        {
            a[k]=L[i];
            i=i+1;
            k=k+1;
        }
        while(j<nR)
        {
            a[k]=R[j];
            j=j+1;
            k=k+1;
        }

    }

    public void mergesort(int a[] )
    {
        int n=a.length;
        int left[];
        int right[];
        int mid;
        if(n<=1)
        {
            return;
        }else
        {
            mid=n/2;
        }
        left=new int[mid];
        right=new int[n-mid];

        System.arraycopy(a,0,left,0,left.length);
        System.arraycopy(a,left.length,right,0,right.length);

//        for(int i=0;i<=mid-1;i++)
//        {
//            left[i]=a[i];
//        }
//        for(int i=mid;i<=n-1;i++)
//        {
//             right[i-mid]=a[i];
//        }
        mergesort(left);
        mergesort(right);
        merge(left,right,a);

}
}

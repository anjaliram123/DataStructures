package ArraysTutorialHorizon;

import java.util.Arrays;

public class RearrangeElementsDivideandConquer {

    static int [] A = {1,3,5,7,9,2,4,6,8,10};
    public static void main(String[] args) {
        RearrangeElementsDivideandConquer r = new RearrangeElementsDivideandConquer();
        r.rearrange(0,A.length-1);
        System.out.println(Arrays.toString(A));

    }

    public void rearrange(int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = start+(end-start)/2;
        int x = 1+(start+mid)/2;
        int y = mid+1;
        for(int i=x, j=y;i<=mid; i++,j++) {
            swap(i, j);
        }
        rearrange(start,mid);
        rearrange(mid+1,end);
    }

    private void swap(int a, int b ){
        int temp = A[a];
        A[a]=A[b];
        A[b]=temp;
    }

}

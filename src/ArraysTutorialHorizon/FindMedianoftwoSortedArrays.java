package ArraysTutorialHorizon;

public class FindMedianoftwoSortedArrays{
    public static void main(String[] args) {

        int a[] = {2,6,9};
        int b[] = {1,5,7};
        FindMedianoftwoSortedArrays me = new FindMedianoftwoSortedArrays();
        double median = me.combineAndGetMedian(a,b);
        System.out.println("The median is" +median);
    }

    public double combineAndGetMedian(int a[], int b[]){

        int c[] = new int[2*a.length];
        int j=0;
        int k=0;
        for(int i=0;i<c.length-1;i++) {
            if(a[j] <= b[k]) {
                c[i]=a[j];
                j++;
            }else {
                c[i]=b[k];
                k++;
            }
        }

        if(k>j){
            c[c.length-1]=a[j];
        }

        if(k<j){
            c[c.length-1]=a[k];
        }


        int n = c.length;
        double median = 0;
        int start = 0;
        if(n%2==0) {
            double num = c[start+(n/2)];
            double num1 = c[start+((n-1)/2)];
            median = (num+num1)/2;
        }
        else {
            double num = c[start+((n-1)/2)];
            median = num;
        }
        return median;
    }




}

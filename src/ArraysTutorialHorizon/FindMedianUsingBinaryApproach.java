package ArraysTutorialHorizon;

public class FindMedianUsingBinaryApproach {

    public static void main(String[] args) {
//o(logn)
        FindMedianUsingBinaryApproach binary = new FindMedianUsingBinaryApproach();
        int a[] = {2,6,9,10,11};
        int b[] = {1,5,7,12,15};

        float x = binary.findMedian(a, 0, a.length-1,b, 0, b.length-1);
        System.out.println("Median is "+x);
    }

    public float findMedian(int a[], int start_a, int end_a, int b[], int start_b, int end_b) {
        if (end_a - start_a + 1 == 2 && end_b - start_b + 1 == 2) {
            float x = Math.max(a[start_a], b[start_b]);
            float y = Math.min(a[end_a], b[end_b]);
            return (x + y) / 2;
        }

        float median_a = getMedian(a, start_a, end_b);
        float median_b = getMedian(b, start_b, end_b);

        int mid_a = start_a + (end_a-start_a) / 2;
        int mid_b = start_b + (end_b-start_b) / 2;

        if (median_a > median_b) {
            return findMedian(a, start_a, mid_a, b, mid_b, end_b);
        } else {
            return findMedian(a, mid_a, end_a, b, start_b, mid_b);
        }
    }

    private float getMedian(int ar[], int start, int end){
        int size = end-start+1;
        if(size%2==0){
            float m = ar[start+(size/2)];
            float n =  ar[start+(size-1)/2];
            return (m+n)/2;
        }else {
            float m = ar[start+(size-1)/2];
            return m;
        }
    }

}

package ArraysTutorialHorizon.Sorting;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int a[] = {1};
        int res =  bs.search(a, 10, 0, a.length-1);
        System.out.println(res);
        bs.integerOverFlow();
    }

    public int search(int a[], int number, int start, int end) {
        if(end >= start) {
            int mid = start + (end-start)/2;
            if(a[mid]==number){
                return a[mid];
            } else if(a[mid] > number) {
                return search (a, number, start, mid-1);
            } else {
                return search (a, number, mid+1, end);
            }
        }
        return -1;
    }

    public boolean integerOverFlow() {
        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        int middle = (start+end)/2; //overflows
        int mid = start +(end-start)/2; //doesnt overflow
        return true;
    }
}

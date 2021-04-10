package ArraysTutorialHorizon;

public class BubbleSortMyWay {

    public static void main(String[] args) {
        BubbleSortMyWay bs = new BubbleSortMyWay();
        int a[] = {13,56,32,21,9,5};
        a = bs.sort(a);
        for(int i=0; i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public int[] sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}

package Practice;

public class SelectionSort {


    public static void main(String[] args) {

        int a[] = {32, -2, 12, 67, -22, -15, 1};


        for (int i = 0; i < a.length; i++) {
            int min = 0;
            int temp = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {

                    temp = a[j];
                    a[j] = a[min];
                    a[min] = temp;
                }
                min++;
            }


        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}

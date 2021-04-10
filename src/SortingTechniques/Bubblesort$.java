package SortingTechniques;

public class Bubblesort$ {

    public static void main(String[] args) {

        int a[] = {32, 45, 12, 67, -22, 15, 1};

        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }//Big o is O(n^2) it is a stable Algorthim
    }
}

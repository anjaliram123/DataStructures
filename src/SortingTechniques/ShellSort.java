package SortingTechniques;

public class ShellSort {

    public static void main(String[] args) {
        int a[] = {20, 35, -15, 7, 55, 1, -22};

        for(int gap=a.length/2;gap>0;gap=gap/2) {
            for (int j = gap; j <a.length; j++) {
                int i = j - gap;
                int key = a[j];
                while (i >=gap && a[i] > key) {
                    a[i + gap] = a[i];
                    i = i - 1;
                    a[i + 1] = key;
                }
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}

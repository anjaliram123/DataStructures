package ArraysTutorialHorizon;

import java.util.Arrays;

public class ArrayReversePrint {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6};
        ArrayReversePrint print  = new ArrayReversePrint();
        String s = print.reversePrint(a);
        System.out.println(s);
    }

    public String reversePrint(int a[]){
        int result[] = new int[a.length*2];

        int end = a.length-1;
        int start = 0;

        int count = 0;
        for(int i=0;i<a.length;i++){
            result[i]=a[i];
            count++;
        }

        for(int i=a.length-1;i>=0;i--) {
            result[count] = a[i];
            count++;
        }
        return Arrays.toString(result);
    }
}

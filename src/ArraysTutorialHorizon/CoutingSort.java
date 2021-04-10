package ArraysTutorialHorizon;

import java.util.Arrays;

public class CoutingSort {

    public static void main(String[] args) {
        int a [] = { 2,1,4,5,7,1,7,11,8,9,10};
        CoutingSort c = new CoutingSort();
        //c.sort(a);
        System.out.println(c.sort(a));
    }


    public String sort(int a[]){
        int count[] = new int[a.length+1];
        int result[] = new int[a.length+1];


        //intially count array will be all zero
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }

        //now count array will store frequency of each element of input array

        for(int i=0;i<a.length;i++){
            int x = count[a[i]];
            x++;
            count[a[i]] = x;
        }

        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }


        for(int i=a.length-1;i>=0;i--){
            int x = count[a[i]];
            result[x]=a[i];
            x--;
            count[a[i]]=x;
        }

      return Arrays.toString(result);
    }


}

package ArraysTutorialHorizon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MajortiyElementPart1 {

    public static void main(String[] args) {
        //Majorty element is the one that appears more than n/2 times
        //n is size of array
        int [] a = {1,3,5,5,5,5,4,1,5};
        MajortiyElementPart1 m = new MajortiyElementPart1();
        int majorityelement = m.getElement(a);
        System.out.println(majorityelement);
    }

    public int getElement(int [] a){
        /* //o(n^2)
       int element = 0;
        int count = 1;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length-1;j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }

            if(count>(a.length/2)) {
                //System.out.println("Element is "+a[i]);
                element = a[i];
            }
        }
      return element;
    }*/

        //Using HashMap - Timeo(n) space -o(n)
        int element = 0;
        int count = 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            if(hm.containsKey(a[i])) {
               hm.put(a[i], count++);
            } else{
               hm.put(a[i],1);
            }
        }

        for(Map.Entry m: hm.entrySet()){
            int val = (int) m.getValue();
            if(val > a.length/2) {
                System.out.println("The element is "+m.getKey());
            }
            element = (int) m.getKey();
        }

        return element;
    }

}

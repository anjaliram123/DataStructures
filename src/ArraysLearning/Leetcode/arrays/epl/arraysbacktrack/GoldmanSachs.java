package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;

public class GoldmanSachs {


    //'N' students are sitting in a circle, A teacher sings a song of length 'K' and moves around the circle when the songs ends each student is remvoed from
    // the circle - finally one student remains and he is the president
    //For example no.of students are {1,2,3,4} the song length k = 2;
    //teacher starts from studnet 1 and reaches student 2 which is equal to k - so student 2 will be removed
    //teacher starts from student 3 and moves to student 4 - student 4 will be removed
    //teacher starts from student 1 and moves to student to 3 - student 3 is removed
    //finally studnt 1 remains electd as president.
    public static void main(String[] args) {
        GoldmanSachs gs = new GoldmanSachs();
        int n = 4;
        int k = 3;
        int res = gs.whoIsPresident(n,k);
        System.out.println(res);
    }

    public int whoIsPresident(int n , int k) {
        List<Integer> students = new ArrayList<>();
        if(n== 1) {
            return 1;
        }
        if(n == 0 ){
            return -1;
        }
        for(int i=0;i<n;i++) {
            students.add(i+1);
        }
        int index = 0;

        if(k >= students.size()) {
            index  %= students.size();
        }
        while(students.size() > 1) {
            index += k-1;
            if(index >= students.size()) {
                index  %= students.size();
            }
            students.remove(index);
        }
        return students.get(0);
    }


}

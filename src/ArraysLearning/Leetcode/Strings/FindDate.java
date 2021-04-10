package ArraysLearning.Leetcode.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FindDate {

    public static void main(String[] args) throws ParseException {
        String s = "28-April-2020";
        Date d1  = new SimpleDateFormat("dd-MMM-yyyy").parse(s);
        Long l = d1.getTime();
        long ll = 1587421444845L;
        long l2 = 1587669616733L;
        Date dd = new Date(ll);
        Date d2 = new Date(l2);
        System.out.println(l);
        System.out.println(dd);
        System.out.println(d2);
        long v = 1000*60*60*24;
        long curr = System.currentTimeMillis();
        //System.out.println(curr - v);
        System.out.println(v);
        Date res = new Date(curr - v);
        System.out.println(res);
       // String later = "30-April-2020";


    }
}

package ArraysLearning.target;

public class TargetCalss {

    public static void main(String[] args) {
        TargetCalss c = new TargetCalss();
        String res = "1111010101111";
        int counter = 0;

        System.out.println("Intial res " +res);
        while(!res.equalsIgnoreCase("0")){
            System.out.println("res is " +res);
            res = c.getString(res);
            counter = counter +1;
        }

        System.out.println("counter value is " +counter);
    }

    public String getString (String s) {
        s = s.replaceFirst("^0+(?!$)","");
        System.out.println("After removing leading zeros" + s);
        String s1 = "";
        String s2 = "";

        char c = s.charAt(s.length()-1);
        s2 = s2 + c;
        s1 = s.substring(0,s.length()-1);

        System.out.println("s1 is " +s1);
        System.out.println("s2 is " +s2);

        if(s2.equalsIgnoreCase("1")) {
            s1 = s1 + "0";
        }
        return s1;
    }
}

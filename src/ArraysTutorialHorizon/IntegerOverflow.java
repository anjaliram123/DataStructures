package ArraysTutorialHorizon;

public class IntegerOverflow {

    public static void main(String[] args) {
        IntegerOverflow f = new IntegerOverflow();
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        int SUB = (b-a);
        int mid = SUB/2;
       // int fi = a + mid;
        System.out.println(mid);
    }
}

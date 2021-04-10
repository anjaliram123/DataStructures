package ArraysTutorialHorizon;

public class MinimumCopyPasteOperations {

    public static void main(String[] args) {
        MinimumCopyPasteOperations mc = new MinimumCopyPasteOperations();
        int min = mc.minOperations(50);
        System.out.println("Minimum operations are " +min);
    }

    public int minOperations(int number) {
        int res = 0;
        for(int i=2;i<=number;i++) {
            while(number%i==0){
                number = number/i;
                res = res+i;
            }
        }
        return res;

    }


}

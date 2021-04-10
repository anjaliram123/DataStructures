package ArraysLearning.Leetcode.BitOperations;

public class XORPairs {

    public static void main(String[] args) {

        XORPairs xp = new XORPairs();

        int [] input = {2, 1, 5, 6, 9, 12, 11, 10, 3};

        int numberOfXORS = 0;

        int evenCount = 0;
        int oddCount = 0;
        for(int i=0 ;i<input.length;i++) {
            if(input[i] % 2 == 0) {
                evenCount ++;
            } else {
                oddCount ++;
            }
        }

        //choosing two numbers out of evencount and oddcount which is nc2 -- > nc2 = n(n-1)/2 --> ncr = n!/(n-r)!*r!
        numberOfXORS = evenCount * (evenCount - 1)/2 + oddCount * (oddCount  - 1)/2;
        System.out.println(numberOfXORS);
    }
}

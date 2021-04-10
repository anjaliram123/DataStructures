package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class primes {

    public static void main(String[] args) {
        primes p = new primes();
        int count = p.countPrimes(10);
        System.out.println(count);
    }

    public int countPrimes(int n ) {
        boolean [] notPrimes= new boolean[n+1];
        int count = 0;
        notPrimes[0] = true;
        notPrimes[1] = true;

        for(int i=2;i<Math.sqrt(n);i++) {
            if(!notPrimes[i]) {
                for(int j=2;j*i<n;j++) {
                    notPrimes[j*i]=true;
                }
            }
        }

        for(int i=2;i<n;i++) {
            if(!notPrimes[i]){
                count++;
            }
        }

        return count;
    }

}

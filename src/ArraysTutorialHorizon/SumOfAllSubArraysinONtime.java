package ArraysTutorialHorizon;

public class SumOfAllSubArraysinONtime {

    public static void main(String[] args) {
        SumOfAllSubArraysinONtime s = new SumOfAllSubArraysinONtime();
        int [] a = {1,2,3};

        int sum = s.getSum(a);
        System.out.println("The sum is"+sum);
    }

    public int getSum(int a[]){

        int totalsum = 0;
        int n = a.length;
        for(int i=0;i<a.length;i++){
            totalsum = totalsum+(a[i]*(n-i)*(i+1));
        }
        return totalsum;
    }


}

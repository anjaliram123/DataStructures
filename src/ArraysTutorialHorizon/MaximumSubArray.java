package ArraysTutorialHorizon;

public class MaximumSubArray {

    public static void main(String[] args) {

        int input [] ={-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray m = new MaximumSubArray();
        int x= m.maxsubarray(input);
        System.out.println(x);
    }

    public int maxsubarray(int a[]) {
        int maxsum = a[0]; int sum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a.length == 0 || a == null) {
                return 0;
            }
            if(sum<0){
                sum = a[i];
            }else{
                sum = sum+a[i];
            }
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}

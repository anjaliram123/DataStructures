package ArraysTutorialHorizon;

public class CountSubArraysPorductlessthanKusingloops {

    public static void main(String[] args) {

        int [] nums = {10,4,2,6};
        int K = 100;
        CountSubArraysPorductlessthanKusingloops c = new CountSubArraysPorductlessthanKusingloops();
        int r = c.countAndPrint(nums, K);
        System.out.println(r);
    }

    public int countAndPrint(int[] nums, int k){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<=nums.length;j++){
                int product = 1;
                int noOfElements = 0;
                String subArrays = " ";
                for(int m=i;m<j;m++){
                    product = product*nums[m];
                    subArrays = subArrays + nums[m]+" ";
                    noOfElements++;
                }
                if(product<k && noOfElements > 0){
                    System.out.print(subArrays);
                    result++;
                    System.out.println();
                }
            }
        }
        return result;
    }
}

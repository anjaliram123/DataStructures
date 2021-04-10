package ArraysTutorialHorizon;

public class SubarrayswithProductlessthanK {

    public static void main(String[] args) {
        int [] nums = {10,4,2,6};
        SubarrayswithProductlessthanK prod = new SubarrayswithProductlessthanK();
        System.out.println("the no.of subarrays is "+prod.printProduct(nums,40));
    }

    public int printProduct(int[] nums, int ki) {
        int result = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<=nums.length;j++) {
                int product = 1;
                int noofelements = 0;
                String tempSubArrrays ="";
                for(int k=i;k<j;k++) {
                    tempSubArrrays += nums[k] +" ";
                    product = product * nums[k];
                    noofelements++;
                }

                if(product<ki && noofelements>0){
                    System.out.print(tempSubArrrays);
                    result++;
                    System.out.println();
                }
            }

        }
        return result;
    }
}

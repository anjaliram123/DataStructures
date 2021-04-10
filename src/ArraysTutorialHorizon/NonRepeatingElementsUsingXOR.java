package ArraysTutorialHorizon;

public class NonRepeatingElementsUsingXOR {

    //time - o(n) and space will be o(1)
    public static void main(String[] args) {
        int [] arr = {4,5,4,5,3,2,9,3,9,8};

        int xor = arr[0];
        for(int i=1;i<arr.length;i++){
            xor ^= arr[i];
        }

        System.out.println(xor);
        int right_most_set_bit = xor & ~(xor-1);
        System.out.println(right_most_set_bit);
    }




}

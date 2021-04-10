package ArraysStrings;

public class PermutationofString {

    public static void main(String[] args) {
        PermutationofString ps = new PermutationofString();
        String input = "abc";
        char [] res = input.toCharArray();
        int left = 0;
        int size = res.length;
        ps.permute(res, left, size);
    }

    public void permute(char[] res, int left, int size){
        int x;
        if(left == size){
           for(int i=0;i<res.length;i++){
               System.out.print(res[i]);
           }
            System.out.print(" ");
        }else{
            for( x = left;x<size;x++){
                swap(res,left,x);
                permute(res, left+1, size);
                swap(res,left,x);
            }
        }

    }

    public void swap(char c[], int i, int j){
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
    }
}

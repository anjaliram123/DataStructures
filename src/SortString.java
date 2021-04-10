public class SortString {
    public static void main(String[] args) {

        String s ="Anjali";

        char arr[]= s.toCharArray();

        for(int i=0;i<arr.length;i++) {
            char temp = 0;
            for(int j=i+1;j<arr.length-1;j++) {
                if(arr[i] > arr[j]) {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}

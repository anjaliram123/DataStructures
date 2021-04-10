package ArraysLearning.misc;

public class Sparsearrays {

    public static void main(String[] args) {
        Sparsearrays sp = new Sparsearrays();
        String s [] = {"def","de","fgh"};
        String q [] = {"de", "lmn","fgh"};
        String ss [] = {"aba", "baba", "aba", "xzxb"};
        String qq [] = {"aba","xzxb","ab"};
        int [] a = sp.getCount(ss,qq);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public int[] getCount(String [] strings, String[] queries) {
        int len = queries.length;
        int arr[] = new int[len];
        int k = 0;
        for(int i=0;i<queries.length;i++) {
            int count = 0;
            for(int j=0;j<strings.length;j++) {
                if(queries[i].equalsIgnoreCase(strings[j])){
                    count++;
                }
            }
            arr[k]=count;
            k++;
        }
        return arr;
    }
}

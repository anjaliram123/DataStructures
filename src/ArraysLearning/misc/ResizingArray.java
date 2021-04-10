package ArraysLearning.misc;

public class ResizingArray {

    public static void main(String[] args) {
        ResizingArray r = new ResizingArray();
        r.resize(4);
    }

    public void resize(int number){
        int[] a = new int[2];
        a[0]=21;
        a[1]=22;
        int[] b = null;
        if(number> a.length){
            b = new int[a.length*2];
        }

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
    }
}

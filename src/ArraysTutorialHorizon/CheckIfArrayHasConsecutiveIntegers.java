package ArraysTutorialHorizon;

public class CheckIfArrayHasConsecutiveIntegers {
    public static void main(String[] args) {
        int [] arrA = {21,24,22,26,23,-25};
        CheckIfArrayHasConsecutiveIntegers  c = new CheckIfArrayHasConsecutiveIntegers();
        boolean x = c.check(arrA);
        System.out.println(x);

    }

    //if array contains negative elements also
    public boolean check(int [] a){
        int auxArray [] = new int[a.length];
        int max = getMax(a);
        int min = getMin(a);
        if(a.length!=max-min+1){
            return false;
        }

        for(int i=0;i<a.length;i++){
            a[i]=a[i]-min;
            auxArray[i]=0;
        }

        for(int i=0;i<a.length;i++){
            if(auxArray[a[i]]==0){
                auxArray[a[i]]=1;
            }else {
                return false;
            }
        }
        return true;

    }


    private int getMax(int [] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
         max = Math.max(a[i],max);
        }
        return max;
    }

    private int getMin(int [] a){
        int min = a[0];
        for(int i=1;i<a.length;i++){
            min = Math.min(a[i], min);
        }
        return min;
    }
}

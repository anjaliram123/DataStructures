package ArraysTutorialHorizon;

public class DuplicatesInArrayUsingAuxilaryArray {

    public static void main(String[] args) {
        int a[]={4,3,2,1,2,5,5};
        DuplicatesInArrayUsingAuxilaryArray d = new DuplicatesInArrayUsingAuxilaryArray();
        d.duplicates(a);
    }

    public void duplicates(int a[]){
        int aux[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=a[i];
            aux[i]=0;
        }
        String s =" ";
        for(int i=0;i<a.length;i++){
            if(aux[a[i]]==0){
                aux[a[i]]=1;
            }else{
                s = s+a[i]+" ";
            }
        }

        System.out.println(s);
    }



}

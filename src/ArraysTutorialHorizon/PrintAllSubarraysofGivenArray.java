package ArraysTutorialHorizon;

public class PrintAllSubarraysofGivenArray {

    public static void main(String[] args) {
        int a [] = {1,2,3};
        PrintAllSubarraysofGivenArray p = new PrintAllSubarraysofGivenArray();
        p.print(a);

    }

    public void print(int [] a) {
        //startpoint
        for(int i=0;i<a.length;i++) {
            //divides into groups
            for(int j=i;j<=a.length;j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }

    }
}

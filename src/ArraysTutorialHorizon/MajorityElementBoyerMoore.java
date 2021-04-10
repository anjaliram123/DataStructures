package ArraysTutorialHorizon;

public class MajorityElementBoyerMoore {

    public static void main(String[] args) {
        MajorityElementBoyerMoore boyer = new MajorityElementBoyerMoore();
        //Time complexity is o(n)
        //Space complexity is o(1)
     int a [] = {1,3,5,5,5,5,4,1,5};
     boyer.findMajority(a);
    }

    public void findMajority(int a[]){
        //first iteration find the element which could be a majority element
        //second iteration-  check the element(found in first iteration) count is greater than n/2

        int size = a.length;
        if(size==0) {
            return;
        }

        int majorityElement = a[0];
        int count = 1;
        for(int i=1;i<a.length;i++){
            if(majorityElement==a[i]){
                count++;
            }else if(count == 0){
                majorityElement = a[i];
                count = 1;
            }else{
                count--;
            }
        }

        count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==majorityElement){
                count++;
            }
        }

        if(count > (size/2)){
            System.out.println("majority element is "+majorityElement);
        }
    }

}

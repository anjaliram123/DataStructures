package ArraysTutorialHorizon;

public class FirstThreeLargest {
    public static void main(String[] args) {
        int [] a ={6,8,1,9,2,1,10};
        FirstThreeLargest f =  new FirstThreeLargest();
        f.get3max(a);
    }

    public void get3max(int[]a){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            int curr = a[i];
            if(firstMax < curr){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = curr;
            }else if(secondMax < curr){
                thirdMax = secondMax;
                secondMax = curr;
            }else if(thirdMax < curr){
                thirdMax = curr;
            }
        }

        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(thirdMax);

    }
}

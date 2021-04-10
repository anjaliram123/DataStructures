package ArraysLearning.Leetcode.PriorityQueue;

public class MinimumNumberofFuelStops {

    public static void main(String[] args) {
        MinimumNumberofFuelStops m = new MinimumNumberofFuelStops();
        int target = 100;
        int startFuel = 25;
        int [][] stations = {{25,25},{50,25},{75,25}};
        int count = m.minRefuelStops(target, startFuel, stations);
        System.out.println(count);

    }

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
       /* int count = 0;
        int remainingTarget = 0;
        int remainingFuel = 0;
        int totalTravelled = 0;
        if(target > startFuel){
            remainingTarget = target - startFuel;
        } else {
            remainingFuel = startFuel - target;
        }

        if(remainingTarget == 0) {
            return 0;
        } else {
            totalTravelled = totalTravelled + startFuel;
            startFuel = 0;//we have exhausted startFuel
            for(int i=0; i<stations.length; i++) {
                if(stations[i][0] > totalTravelled && startFuel < stations[i][1]){
                    return -1;
                }
                if(stations[i][0] <= totalTravelled && startFuel < stations[i][1]){
                    startFuel = startFuel + stations[i][1];
                    count = count + 1;
                    totalTravelled = totalTravelled + stations[i][0];
                } else {
                    totalTravelled = totalTravelled + stations[i][0];
                    startFuel = startFuel - stations[i][0];
                }
            }
        }

        return count == 0 ? -1 : count;
    }*/
        int count = 0;
        if(target == startFuel) {
            return 0;
        }
        for(int i=0; i<stations.length; i++) {
            if(target == 0) {
                return 0;
            }
            target = target - stations[i][0];
            startFuel = startFuel - stations[i][0];
            if(startFuel == 0) {
                startFuel = startFuel + stations[i][1];
                count = count + 1;
            } else if(startFuel < 0) {
                //we can't reach destination
                return -1;
            } else {
                //do nothing
            }
        }
        return count;
    }
}

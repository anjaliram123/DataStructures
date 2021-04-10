package ArraysLearning.Leetcode.PriorityQueue;

import java.util.*;

public class KclosestPointstoOrigin {

    public static void main(String[] args) {
        KclosestPointstoOrigin k = new KclosestPointstoOrigin();
        int points [][] = {{1,3},{-2,2}};
        int [][] res = k.kClosest(points,1);
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] kClosest(int[][] points, int K) {

        /*if(points.length == 0 || points[0].length == 0) return points;
        Map<int[], Integer> maps  = new HashMap();

        for(int i=0;i<points.length;i++) {
            int arr[] = new int[points.length];
            int dis = 0;
            for (int j = 0; j < points[0].length; j++) {
                dis = dis + points[i][j]*points[i][j];
                arr[j] = points[i][j];
            }
           maps.put(arr,dis);
        }

        PriorityQueue<int[]> minheap = new PriorityQueue<>((n1,n2) -> (maps.get(n2) - maps.get(n1)));

       for(int[] a: maps.keySet()){
            minheap.add(a);
            if(minheap.size() > K) {
                minheap.poll();
            }
        }

        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] temp = minheap.poll();
            res[i][0] = temp[0];
            res[i][1] = temp[1];
        }
        return res;*/

        if(points.length == 0 || points[0].length == 0) return points;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> ((a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])));
        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
        }
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] temp = pq.poll();
            res[i][0] = temp[0];
            res[i][1] = temp[1];
        }
        return res;

    }
}

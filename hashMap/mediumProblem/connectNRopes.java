package hashMap.mediumProblem;

import java.util.PriorityQueue;

public class connectNRopes {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
        }
        int cost=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int sm=a+b;
            cost+=sm;
            pq.add(sm);
        }
        return cost;
    }
}

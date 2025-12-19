package hashMap.mediumProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class jMostFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i))
            m.put(i,m.get(i)+1);
            else
            m.put(i,1);
        }

        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> map:m.entrySet()){
            q.add(new int[]{map.getKey(),map.getValue()});
            if(q.size()>k)
            q.poll();
        }
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            // int temp[]=q.poll();
            a[i]=q.poll()[0];
        }
        return a;
    }
    
}

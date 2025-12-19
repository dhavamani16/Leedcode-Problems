package hashMap.mediumProblem;

import java.util.PriorityQueue;

public class kthElementInStream {
    int k;
    PriorityQueue<Integer>q=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            q.add(i);
            if(q.size()>k)
            q.poll();
        }
    }
    
    public int add(int val) {
        q.add(val);
        if(q.size()>k)
        q.poll();

        return q.peek();
    }
}

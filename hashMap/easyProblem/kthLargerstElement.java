package hashMap.easyProblem;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargerstElement {
    public int findKthLargest(int[] nums, int k) {
        
        int n=nums.length;
        int h=n/2;
        
        if(h<=k){
            PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
            for(int x:nums) q.add(x);
            while(k>1){
                q.poll();
                k--;
            }
            return q.peek();
        }
        else{
            PriorityQueue<Integer>q=new PriorityQueue<>();
            for(int x:nums) q.add(x);
            int rem=n-k;
            while(rem>0){
                q.poll();
                rem--;
            }
            return q.peek();
        }
    
}

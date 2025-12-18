import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int h=n/2;
        if(k<=h){
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for(int x:arr) q.add(x);
            k--;
            while(k>0){
                q.poll();
                k--;
            }
            return q.peek();
        }
        else{
            PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
            for(int x:arr) q.add(x);
            int rem=n-k;
            while(rem>0){
                q.poll();
                rem--;
            }
            return q.peek();
        }
    }
}

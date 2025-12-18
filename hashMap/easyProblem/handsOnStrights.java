import java.util.HashMap;
import java.util.PriorityQueue;

public class handsOnStrights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int val:hand)
            freq.put(val,freq.getOrDefault(val,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : freq.keySet())
            pq.add(x);
        while(!pq.isEmpty()){
            int first = pq.peek();
            if(freq.get(first)==0)
              pq.poll();
            else
            {
                freq.put(first , freq.get(first)-1);
                for(int i=1;i<=groupSize-1;i++){
                    ++first;
                    if(!freq.containsKey(first) || freq.get(first)==0)
                        return false; 
                    freq.put(first , freq.get(first)-1);
                }
            }
        }
        return true;
        
    }
}

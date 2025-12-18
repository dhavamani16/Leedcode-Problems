import java.util.PriorityQueue;

public class rank {
    
    public int[] arrayRankTransform(int[] arr){
		PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<arr.length;i++){
            pq.add(new int[]{arr[i],i});
        }
        int val=Integer.MAX_VALUE;
        int rank=0;
        while(!pq.isEmpty()){
            int top[]=pq.poll();
            int fir=top[0];
            int las=top[1];
            if(val==Integer.MAX_VALUE || val!=fir){
                rank++;
            }
            arr[las]=rank;
            val=fir;
        }
        return arr;
	}
}

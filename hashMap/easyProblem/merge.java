public class merge {
    public ListNode mergeKLists(ListNode[] lists) {
       PriorityQueue<ListNode> pq=new PriorityQueue<> ((a,b)->a.val-b.val);
       for(ListNode i:lists){
            if(i!=null){
                pq.add(i);
            }
       }
       ListNode ans=null,temp=null;
       while(!pq.isEmpty()){
            ListNode curr=pq.poll();
            if(ans==null){
                ans=curr;
                temp=curr;
            }
            else{
                temp.next=curr;
                temp=curr;
            }
            if(curr.next!=null){
                pq.add(curr.next);
            }
       }
       return ans;
    }
    
}

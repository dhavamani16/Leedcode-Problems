class ItemNode{
    double val;
    double wt;
    public ItemNode(int val,int wt){
        this.val=val;
        this.wt=wt;
    }
}
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        ItemNode[] arr=new ItemNode[n];
        for(int i=0;i<val.length;i++){
            arr[i]=new ItemNode(val[i],wt[i]);
        }
        Arrays.sort(arr,(a,b)->Double.compare((b.val/b.wt),(a.val/a.wt)));;
        int i=0;
        double cost=0;
        while(capacity>0 && i<n){
            if(arr[i].wt<=capacity){
                cost+=arr[i].val;
                capacity-=arr[i].wt;
            }
            else{
                cost+=(capacity/arr[i].wt)*arr[i].val;
                capacity=0;
            }
            i++;
            
        }
        
        return cost;
        
        
    }
}
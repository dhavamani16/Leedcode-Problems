class Solution {
    public int[] bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree,int V,Queue<Integer> q){
    
    for(int i=0;i<V;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    ArrayList<Integer> order=new ArrayList<>();
    while(!q.isEmpty()){
        int x=q.poll();
        order.add(x);
        for(int v:adj.get(x)){
            indegree[v]--;
            if(indegree[v]==0){
                q.add(v);
            }
        }
        
    }
    if(order.size()!=V){
        return new int[0];
    }
    int[] ans=new int[V];
    for(int i=0;i<V;i++){
        ans[i]=order.get(i);
    }
    return ans;
    } 

    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[V];
        for(int[] i:edges){
            adj.get(i[1]).add(i[0]);
            indegree[i[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        return bfs(adj,indegree,V,q);
}
}

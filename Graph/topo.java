class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> l,int v){
        vis[v]=true;
        for(int x:adj.get(v)){
            if(!vis[x]){
                dfs(adj,vis,l,x);
            }
        }
        l.add(v);
    }
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            
        }
        boolean[] vis=new boolean[V];
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj,vis,l,i);
            }
        }
        
       
        Collections.reverse(l);
        return l;
        
}
}

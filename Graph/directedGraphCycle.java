class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],boolean path[],int v){
        vis[v]=true;
        path[v]=true;
        for(int x:adj.get(v)){
            if(!vis[x] && dfs(adj,vis,path,x)){
                return true;
            }
            else if(path[x]){
                return true;
            }
        }
        path[v]=false;
        return false;
        
    }
    
    public boolean isCyclic(int v, int[][] edges) {
        
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[v];
        boolean[] path=new boolean[v];
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        for(int i=0;i<v;i++){
            if(!vis[i] && dfs(adj,vis,path,i))
                return true;
        }
        return false;
    }

}

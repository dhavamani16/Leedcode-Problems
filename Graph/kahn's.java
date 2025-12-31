class Solution {
    public void bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree,ArrayList<Integer> topo,int V){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            topo.add(x);
            for(int v:adj.get(x)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
        }
    }
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[V];
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }
        ArrayList<Integer> topo=new ArrayList<>();
        bfs(adj,indegree,topo,V);
        return topo;
}
}

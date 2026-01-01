class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree, Queue<Integer>q,int V){
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int x=q.poll();
            c++;
            for(int v:adj.get(x)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
        }
        return c==V;
    }
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[V];
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            indegree[e[1]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        return bfs(adj,indegree,q,V);
    }
}

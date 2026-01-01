class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree,ArrayList<Integer> topo,Queue<Integer>q,int n){
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            for(int v:adj.get(x)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
            topo.add(x);
        }
        return topo;
    }
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        Queue<Integer>q=new LinkedList<>();
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int v:graph[i]){
                adj.get(v).add(i);
                indegree[i]++;
            }
        }
        ArrayList<Integer> topo=new ArrayList<>();
        topo=bfs(adj,indegree,topo,q,n);
        Collections.sort(topo);
        return topo;
    }
}

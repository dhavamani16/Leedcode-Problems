package Graph.ProblemOnBFS.DFS;

public class proviences {
    public void dfs(int[][] isconnected,int v,boolean vis[]){
       
        vis[v]=true;
        
        
            
            for(int i=0;i<isconnected.length;i++){
                if(!vis[i] && isconnected[v][i]==1){
                    vis[i]=true;
                    dfs(isconnected,i,vis);
                  
                
            }
        }
    }
    
    public int findCircleNum(int[][] isconnected) {
        boolean vis[]=new boolean[isconnected.length];
        int prev=0;
        for(int i=0;i<isconnected.length;i++){
            if(!vis[i]){
                prev++;
                dfs(isconnected,i,vis);
            }
        }
        return prev;
    }
}

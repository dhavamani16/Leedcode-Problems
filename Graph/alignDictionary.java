class Solution {
    public String bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<26;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            int x=q.poll();
            sb.append((char)(x+'a'));
            for(int val:adj.get(x)){
                indegree[val]--;
                if(indegree[val]==0){
                    q.add(val);
                }
            }
        }
        return sb.toString();
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    public String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[26];
        Arrays.fill(indegree,-1);
        int c=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(indegree[ch-'a']==-1){
                    indegree[ch-'a']=0;
                    c++;
                }
            }
        }
        for(int i=0;i<words.length-1;i++){
            String str1=words[i];
            String str2=words[i+1];
            int len=Math.min(str1.length(),str2.length());
            boolean valid=false;
            for(int j=0;j<len;j++){
                    if(str1.charAt(j)!=str2.charAt(j)){
                        indegree[str2.charAt(j)-'a']++;
                        adj.get(str1.charAt(j)-'a').add(str2.charAt(j)-'a');
                        valid=true;
                        break;
                    }
                }
                if(!valid && str1.length()>str2.length()){
                    return "";
                }
            }
    
            String ans=bfs(adj,indegree);
            if(ans.length()==c){
                return ans;
            }
            return "";
            
        }
    }
}

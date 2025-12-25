import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.tree.TreeNode;

public class maximumWidth {
    class Pair{
        TreeNode node;
        int ind;
        Pair(TreeNode node,int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> que = new ArrayDeque<>();
        que.add(new Pair(root,0));
        int maxWidth=0;
        while(!que.isEmpty()){
            int first=0;
            int last=0;
            int n=que.size();
            int minInd=que.peekFirst().ind;
            for(int i=0;i<n;i++){
                Pair cur=que.poll();
                int curind=cur.ind-minInd;
                if(i==0) first=curind;
                if(i==n-1) last=curind;
                if(cur.node.left!=null) que.add(new Pair(cur.node.left,2*curind+1));
                if(cur.node.right!=null) que.add(new Pair(cur.node.right,2*curind+2));
            }
            maxWidth=Math.max(maxWidth,last-first+1);
        }
        return maxWidth;
    }
}

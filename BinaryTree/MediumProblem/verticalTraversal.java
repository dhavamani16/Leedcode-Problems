package BinaryTree.MediumProblem;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class verticalTraversal {
    public void preorder(TreeNode root,int row,int col,ArrayList<int []> res){
        if(root!=null){
            res.add(new int[]{col,row,root.val});
            preorder(root.left,row+1,col-1,res);
            preorder(root.right,row+1,col+1,res);
        }

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        ArrayList<int []>res=new ArrayList<>();
        preorder(root,0,0,res);
        res.sort((a,b)->
        {
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
            if(a[1]!=b[1])
                return Integer.compare(a[1],b[1]);
            return Integer.compare(a[2],b[2]);
        });
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        int preCol=Integer.MIN_VALUE;
        List<Integer> level=new ArrayList<>();
        for(int[] node:res){
            if(node[0]!=preCol){
                if(preCol!=Integer.MIN_VALUE)
                    ans.add(level);
                level=new ArrayList<>();
                
                preCol=node[0];
            }
            level.add(node[2]);
        }
        ans.add(level);
        return ans;
    }
}

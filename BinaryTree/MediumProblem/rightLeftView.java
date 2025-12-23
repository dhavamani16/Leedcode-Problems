package BinaryTree.MediumProblem;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class rightLeftView {
    List<Integer> res=new ArrayList<>();
    public void preorder(TreeNode root,int row){
        if(root!=null){
            if(res.size()==row)
                res.add(root.val);
            preorder(root.right,row+1);
            preorder(root.left,row+1);
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        preorder(root,0);
        return res;
    }
    
}

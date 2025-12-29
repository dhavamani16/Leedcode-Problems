package Leedcode.BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class postOrder {
    public void postorder(TreeNode root, List<Integer> ans){
        if(root!=null){
            postorder(root.left,ans);
            postorder(root.right,ans);
            ans.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
        
    }
    
}

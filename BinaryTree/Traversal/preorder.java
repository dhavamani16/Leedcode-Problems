package Leedcode.BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class preorder {
    public void preorder(TreeNode root,List<Integer> ans){
        if(root!=null){
            ans.add(root.val);
            preorder(root.left,ans);
            preorder(root.right,ans);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }

}

package Leedcode.BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class inOrder {
    public void inorder(TreeNode root,List<Integer> ans){
        if(root!=null){
            inorder(root.left,ans);
            ans.add(root.val);
            inorder(root.right,ans);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}

package BinaryTree.HardProblem;

import javax.swing.tree.TreeNode;

public class LCAinBinary {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode lca1=lowestCommonAncestor(root.left,p,q);
        TreeNode lca2=lowestCommonAncestor(root.right,p,q);
        if(lca1==null){
            return lca2;
        }
        if(lca2==null){
            return lca1;
        }
        return root;
        
    }
}

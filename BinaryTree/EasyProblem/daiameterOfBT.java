package BinaryTree.EasyProblem;

import javax.swing.tree.TreeNode;

public class daiameterOfBT {
    int maxi=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxi;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        maxi=Math.max(maxi,(left+right));
        return Math.max(left,right)+1;
    }
}

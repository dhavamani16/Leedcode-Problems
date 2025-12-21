package EasyProblem;

import javax.swing.tree.TreeNode;

public class maximumPathSum {
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return maxi;
        
    }
    public int pathsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(pathsum(root.left),0);
        int right=Math.max(pathsum(root.right),0);
        maxi=Math.max((left+right+root.val),maxi);
        return Math.max(left,right)+root.val;
    }
}

package Easy

import javax.swing.tree.TreeNode;

-Problem;

public class heightOfBT {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        
    }
}

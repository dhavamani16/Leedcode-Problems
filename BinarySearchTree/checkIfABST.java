package BinarySearchTree;

public class checkIfABST {
    
public boolean isValidBSTUtil(TreeNode root,long x,long y){
        if(root==null){
            return true;
        }
        return (root.val>x && root.val<y)
        && isValidBSTUtil(root.left,x,root.val) && isValidBSTUtil(root.right,root.val,y); 
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBSTUtil(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
}

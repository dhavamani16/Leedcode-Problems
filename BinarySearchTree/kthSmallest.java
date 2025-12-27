package BinarySearchTree;

import javax.swing.tree.TreeNode;

public class kthSmallest {
    int cnt=0;
    int res;
    public void inorder(TreeNode root,int k){
        if(root!=null){
            inorder(root.left,k);
            cnt++;
            if(cnt==k){
                res=root.val;
                return;
            }
            inorder(root.right,k);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
}

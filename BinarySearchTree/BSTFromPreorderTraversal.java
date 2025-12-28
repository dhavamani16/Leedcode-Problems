package BinarySearchTree;

import javax.swing.tree.TreeNode;

public class BSTFromPreorderTraversal {
    int idx = 0;

    public TreeNode build(int[] preorder, long lower, long upper) {
        if (idx >= preorder.length)
            return null;

        int val = preorder[idx];
        if (val <= lower || val >= upper)
            return null;

        TreeNode root = new TreeNode(val);
        idx++;

        root.left = build(preorder, lower, val);
        root.right = build(preorder, val, upper);

        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

package BinarySearchTree;

import javax.swing.tree.TreeNode;

public class deleteANodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // Node found
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Find inorder successor
            TreeNode x = root.right;
            while (x.left != null) {
                x = x.left;
            }

            // Replace value
            root.val = x.val;

            // Delete successor
            root.right = deleteNode(root.right, x.val);
        }
        return root;
    }
}

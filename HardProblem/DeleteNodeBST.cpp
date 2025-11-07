#include <iostream>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    // Helper function to find the minimum node in a BST (leftmost node)
    TreeNode* findMin(TreeNode* root) {
        while (root->left != nullptr) {
            root = root->left;
        }
        return root;
    }

    TreeNode* deleteNode(TreeNode* root, int key) {
        if (root == nullptr) return nullptr;

        if (key < root->val) {
            root->left = deleteNode(root->left, key);
        } else if (key > root->val) {
            root->right = deleteNode(root->right, key);
        } else {
            // Node to be deleted found
            
            // Case 1: No child or one child
            if (root->left == nullptr) {
                TreeNode* rightChild = root->right;
                delete root;
                return rightChild;
            } else if (root->right == nullptr) {
                TreeNode* leftChild = root->left;
                delete root;
                return leftChild;
            }

            // Case 2: Node has two children
            // Find inorder successor (smallest in the right subtree)
            TreeNode* minNode = findMin(root->right);
            // Copy successor's value to current node
            root->val = minNode->val;
            // Delete the successor recursively
            root->right = deleteNode(root->right, minNode->val);
        }
        return root;
    }
};

// Example usage
void inorderTraversal(TreeNode* root) {
    if (!root) return;
    inorderTraversal(root->left);
    cout << root->val << " ";
    inorderTraversal(root->right);
}

int main() {
    TreeNode* root = new TreeNode(15);
    root->left = new TreeNode(10);
    root->right = new TreeNode(20);
    root->left->left = new TreeNode(8);
    root->left->right = new TreeNode(12);
    root->right->left = new TreeNode(17);
    root->right->right = new TreeNode(25);

    cout << "Original BST (inorder): ";
    inorderTraversal(root);
    cout << "\n";

    int key = 10;
    root = Solution().deleteNode(root, key);

    cout << "BST after deleting " << key << " (inorder): ";
    inorderTraversal(root);
    cout << "\n";

    return 0;
}

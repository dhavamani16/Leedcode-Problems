#include <climits>
#include <vector>
#include <algorithm>
using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
    int answer = INT_MIN;

    // Returns {min, max, sum} for current subtree.
    vector<int> solve(TreeNode* node) {
        if (node == NULL) {
            return {INT_MAX, INT_MIN, 0};
        }

        vector<int> leftsolve = solve(node->left);
        vector<int> rightsolve = solve(node->right);

        // Check BST property: left max < root < right min
        if (leftsolve[1] >= node->val || rightsolve[0] <= node->val) {
            return {INT_MIN, INT_MAX, 0};
        }

        int res = leftsolve[2] + rightsolve[2] + node->val;
        answer = max(answer, res);

        return {
            min(node->val, leftsolve[0]),
            max(node->val, rightsolve[1]),
            res
        };
    }

public:
    int maxSumBST(TreeNode* root) {
        solve(root);
        return max(answer, 0);
    }
};

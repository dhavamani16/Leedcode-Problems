package BinaryTree.HardProblem;

public class printAllNodeDistanceK {

    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        findParent(root, null, parent);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        visited.add(target);
        int currentDistance = 0;
        while (!queue.isEmpty()) {
            if (currentDistance == k) break;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    queue.add(current.left);
                }
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    queue.add(current.right);
                }
                if (parent.get(current) != null && !visited.contains(parent.get(current))) {
                    visited.add(parent.get(current));
                    queue.add(parent.get(current));
                }
            }
            currentDistance++;
        }
        List<Integer> result = new ArrayList<>();
        for (TreeNode node : queue) {
            result.add(node.val);
        }
        return result;
    }

    private void findParent(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> map) {
        if (node == null) return;
        map.put(node, parent);
        findParent(node.left, node, map);
        findParent(node.right, node, map);
    }
}
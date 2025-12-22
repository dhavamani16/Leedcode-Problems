package BinaryTree.EasyProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

public class zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=levelOrder(root);
        for(int i=1;i<ans.size();i+=2){
            Collections.reverse(ans.get(i));
        }
        return ans;
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Deque<TreeNode>> q = new ArrayDeque<>();
        Deque<TreeNode> n = new ArrayDeque<>();
        if(root==null)
            return res;
        n.addLast(root);
        q.add(n);
        while(true)
        {
            n = q.removeFirst();
            List<Integer> lvlValues = new ArrayList<>();
            Deque<TreeNode> newQ = new ArrayDeque<>();
            while(!n.isEmpty())            
            {
                TreeNode node = n.removeFirst();
                lvlValues.add(node.val);
                if(node.left!=null)
                    newQ.addLast(node.left);
                if(node.right!=null)
                    newQ.addLast(node.right);
            }
            res.add(lvlValues);
            if(newQ.isEmpty())
                break;
            q.addLast(newQ);
        }
        return res;
       }
}

package BinaryTree.MediumProblem;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class boundaryTraversal {
    ArrayList<Integer> res = new ArrayList<>();
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        if (root == null) 
            return res;
        if (!isLeaf(root))
            res.add(root.data);
        leftBoundary(root.left);
        leafBoundary(root);
        rightBoundary(root.right);
        return res;
    }
    boolean isLeaf(Node node) {
        return node!=null && node.left==null && node.right==null;
    }
    void leftBoundary(Node node) {
        while (node!=null) {
            if(!isLeaf(node))
                res.add(node.data);
            if(node.left!=null)
                node=node.left;
            else
                node=node.right;
        }
    }
    void rightBoundary(Node node) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (node!=null) {
            if (!isLeaf(node))
                temp.add(node.data);
            if (node.right != null)
                node=node.right;
            else
                node=node.left;
        }
        for (int i=temp.size()-1;i>=0;i--)
            res.add(temp.get(i));
    }
    void leafBoundary(Node node){
        if (node == null) 
            return;
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        leafBoundary(node.left);
        leafBoundary(node.right);
    }
}

package BinarySearchTree;

import org.w3c.dom.Node;

public class ceilInBST {
    int findCeil(Node root, int x) {
        // code here
        int ceil=-1;
        while(root!=null){
            if(x==root.data){
                return x;
            }
            if(x<root.data){
                ceil=root.data;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
     
        return ceil;
    }
}

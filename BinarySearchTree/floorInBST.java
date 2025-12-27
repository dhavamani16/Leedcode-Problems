package BinarySearchTree;

import org.w3c.dom.Node;

public class floorInBST {
    public static int floor(Node root, int x) {
        // code here
        int ceil=-1;
        while(root!=null){
            if(root.data==x){
                return x;
            }
            else if(x<root.data){
                root=root.left;
            }
            else{
                ceil=root.data;
                root=root.right;
            }
        }
        return ceil;
    }
}

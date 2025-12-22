package BinaryTree.MediumProblem;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class topView {
    int max_col = 0;
    int min_col = 0;
    public void preorder(Node root,int row,int col,HashMap<Integer,int[]> mp)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            if(!mp.containsKey(col) || row < mp.get(col)[1])
                mp.put(col,new int[]{root.data,row});
            if(col>max_col)
                max_col = col;
            if(col<min_col)
                min_col = col;
            preorder(root.left,row+1,col-1,mp);
            preorder(root.right,row+1,col+1,mp);
        }
        
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        HashMap<Integer,int[]> mp = new HashMap<>();
        preorder(root,0,0,mp);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=min_col;i<=max_col;i++)
            result.add(mp.get(i)[0]);
        return result;
        
        
        
    }
}

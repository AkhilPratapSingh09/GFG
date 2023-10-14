import java.util.ArrayList;

import org.w3c.dom.Node;

public class commonnodeinBST {
    class Solution
{
    //Function to find the nodes that are common in both BST.
    static ArrayList<Integer>arr;
    public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        arr=new ArrayList<>();
        contain(root1,root2);
        return arr;
    }
    static void contain(Node root1,Node root2){
        if(root1==null)return;
        contain(root1.left,root2);
        
        int k=check(root1,root2);
        if(k==1)arr.add(root1.data);
        contain(root1.right,root2);
        
    }
    static int check(Node root1,Node root2){
        if(root2==null)return 0;
        if(root2.data==root1.data){
            return 1;
        }
        else if(root1.data>root2.data){
            return check(root1,root2.right);
        }
        else {
           return  check(root1,root2.left);
        }
        
    }
}
}

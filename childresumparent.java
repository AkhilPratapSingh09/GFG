import org.w3c.dom.Node;

public class childresumparent {
    class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static boolean check(Node root){
        if(root == null || root.left == null && root.right == null)return true;
        boolean left = check(root.left);
        boolean right = check(root.right);
        int le = 0;
        int ri = 0;
        if(root.left != null)le = root.left.data;
        if(root.right != null)ri = root.right.data;
        boolean c = le+ri == root.data;
        if(left && right && c)return true;
        else return false;
    }
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(check(root))return 1;
        else return 0;
        
    }
}
 
}

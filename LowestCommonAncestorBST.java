public class LowestCommonAncestorBST {
    class BST
{   
    //Function to find the lowest common ancestor in a BST. 
Node LCA(Node root, int n1, int n2)
	{
	    int m = Math.min(n1, n2);
	    int  x = Math.max(n1,n2);
        if(root.data > n1 && root.data < n2)
            return root;
        else if(root.data > x)
        {
            return LCA(root.left, n1, n2);
        }
        else if(root.data < m)
            return LCA(root.right, n1, n2);
        else
            return root;
    }
}

}

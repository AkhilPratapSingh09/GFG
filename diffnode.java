import java.util.LinkedList;

public class diffnode {
    class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}


class Solution

{
    
    
	public static int countPairs(Node root1, Node root2, int x)
	{
		
		// algo for the problem  --> we can use the BST property
		// step1. traverse the first tree
               // step2. find the value in the second tree using the BST
              // return the count of pairs.
		int count = 0;
		
		LinkedList<Node> list = new LinkedList<>();
		
		if(root1 != null){
		    list.add(root1);
		}
		
		while(list.size() != 0){
		    Node root = list.remove();
		    count += findTheValue(root2, x-root.data);
		    
		    if(root.left != null) list.add(root.left);
		    
		    if(root.right != null) list.add(root.right);
		}
		
		
		return count;
	}
	
	
	// return 1 if found the number else 0
	public static int findTheValue(Node root, int value){
	    
	    if(root !=null && root.data == value) return 1;
	    
	    if(root.left != null && root.data > value) return findTheValue(root.left, value);
	    
	    if(root.right != null && root.data < value) return findTheValue(root.right, value);
	    
	    return 0;
	    
	}
}



}

import java.util.*;
public class leveltraversalspiral {
    
}
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.    
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        boolean flag= true;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                Node node = q.peek();
                q.remove();
                int index = flag?i:n-i-1;
                arr[index] = node.data;
                
                if(node.right!=null) q.add(node.right);
                if(node.left!=null) q.add(node.left);
                
                
            }
            flag = !flag;
            for(int x: arr){
                list.add(x);
            }
        }
        return list;
        
    }
    
}
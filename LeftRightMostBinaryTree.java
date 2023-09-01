import java.util.LinkedList;
import java.util.Queue;

public class LeftRightMostBinaryTree {
    class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Tree
{
    public static void printCorner(Node node)
    {
        if(node==null)return;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(i==0 ||i==n-1){
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                 if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }
    
}
}

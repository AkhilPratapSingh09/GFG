public class KthAncestorTree {
    class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    
    class Solution
    {
        //function to calculate the nodes between root and given node
        public static int nodedist(Node root, int node){
            if(root == null){
                return -1;
            }
            if(root.data == node){
                return 0;
            }
            int ld = nodedist(root.left,node);
            int rd = nodedist(root.right,node);
            if(ld == -1 && rd == -1){
                return -1;
            } else {
                return Math.max(ld,rd) + 1;
            }
        }
        
        public int kthAncestor(Node root, int k, int node)
        {
            //Write your code here
            if(root == null){
                return -1;
            }
            int nh = nodedist(root, node); // returns distance between node and root
            if(nh == k){ // if given dist = k return root
                return root.data;
            }
            //calling the function for left part and right part
            int l = kthAncestor(root.left,k,node);
            int r = kthAncestor(root.right,k,node);
            if(l == -1 && r == -1){
                return -1;
            } else if(l == -1){
                return r;
            } else {
                return l;
            }
        }
    }
}

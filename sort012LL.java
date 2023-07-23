import java.util.ArrayList;



public class sort012LL {
    class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
    class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        ArrayList<Node> a = new ArrayList<>();
        
        Node curr = head;
        
        while(curr!= null){
            
            a.add(curr);    
            curr = curr.next;
        }
        
        int l =0;
        int m = 0;
        int r = a.size()-1;
        
        while(m<=r){
            
            if(a.get(m).data==0){
                
                int temp = a.get(m).data;
                a.get(m).data = a.get(l).data;
                a.get(l).data = temp;
                l++;
                m++;
            }
            else if(a.get(m).data==1){
                m++;
            }
            else{
                int temp = a.get(m).data;
                a.get(m).data = a.get(r).data;
                a.get(r).data = temp;
                r--;
                
            }

        }
  return head;
    }
}
}

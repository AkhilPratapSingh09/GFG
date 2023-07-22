import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class removDuplicateLL {
    
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Set<Integer>seen = new HashSet<>();
         if(head==null)
         return head;
        Node current = head;
        Node prev = null;

        while (current != null) 
        {
            
            if (!seen.contains(current.data))
            {
                seen.add(current.data);
                
                prev =  current;
                
            } 
            else
            prev.next = current.next;
            current = current.next;
        }

        return head;
    }

 
}

}

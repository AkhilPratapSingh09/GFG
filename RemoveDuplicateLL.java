import java.util.*;
public class RemoveDuplicateLL {
    class GfG
{
    //Function to remove duplicates from sorted linked list.
   Node removeDuplicates(Node head){
 
    Node temp=head;
    Node prev=null;
    
    while(temp!=null){
        if(prev!=null && temp.data==prev.data) prev.next=temp.next;
        else prev=temp;
        
        temp= temp.next;
    }
    return head;
 
    }
}

}

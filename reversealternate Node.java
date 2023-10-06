public class reversealternate Node {
    class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        Node curr=odd;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node start2=curr;
        Node start1=odd;
        Node prev=start1.next;

//start1!=start2 (for odd data)

// start1.next!=start2(for even data)


        while(start1!=start2 && start1.next!=start2){
            curr.next=prev;
            curr=curr.next;
            start1.next=prev.next;
            prev=prev.next.next;
            start1=start1.next;
        }

// for even no of data
        if(start1.next==start2){
            start1.next=prev.next;
            curr.next=start2;
            start2.next=null;
            start1.next=reverse(start1.next);
        }

//for odd no of data
        else{
            curr.next=null;
            start1.next=reverse(start1.next);
        }
       
        
    }
    public static Node reverse(Node node){
       Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}


}

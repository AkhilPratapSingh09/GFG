import org.w3c.dom.Node;

public class insertininsortedlist {
    Node sortedInsert(Node head, int key) {
        Node t=new Node(key);
        if(key<head.data)
        {
            t.next=head;
            return t;
        }
        Node pre=head;
        Node cur=head.next;
        while(cur!=null)
        {
            if(key<cur.data)
            {
                pre.next=t;
                t.next=cur;
                return head;
            }
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=t;
        return head;
    }


}

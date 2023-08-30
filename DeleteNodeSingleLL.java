public class DeleteNodeSingleLL {
    class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
    // Your code here
    if(head==null)
    return head;
    if(x==1)
    return head.next;
    
    int i=1;
      Node cur = head;
      while(cur.next!=null){
          i++;
          if(i==x){
           
              cur.next=cur.next.next;
              
          }
          else{
              cur=cur.next;
          }
      }
      return head;
    }
}

}

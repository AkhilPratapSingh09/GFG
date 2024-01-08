import java.util.ArrayList;

import org.w3c.dom.Node;

public class reversell {
    class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
// Your code here
ArrayList<Integer> al1 = new ArrayList<>();
ArrayList<Integer> al2 = new ArrayList<>();
while(node1 != null){
    al1.add(node1.data);
    node1 = node1.next;
}
 
while(node2 != null){
    al2.add(node2.data);
    node2 = node2.next;
}
 
Node ll = new Node(0);
Node ans = ll;
int i = al1.size()-1;
int j = al2.size()-1;
while(i >= 0 && j >= 0){
    if(al1.get(i) > al2.get(j)){
        Node nn = new Node(al1.get(i));
        i--;
        ll.next = nn;
        ll = ll.next;
    }
    else{
        Node nn = new Node(al2.get(j));
        j--;
        ll.next = nn;
        ll = ll.next;
    }
}
while(i >= 0){
    Node nn = new Node(al1.get(i));
        i--;
        ll.next = nn;
        ll = ll.next;
}
while(j >= 0){
    Node nn = new Node(al2.get(j));
        j--;
        ll.next = nn;
        ll = ll.next;
}
 
return ans.next;
    }
}

    
}

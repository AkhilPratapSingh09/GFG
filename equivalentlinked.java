import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.Node;

public class equivalentlinked {
    class Solution
{
   long DecimalValue(Node head)
   {
        ArrayList<Integer> list=new ArrayList<>();
        long mod=(long)1000000007;
        Node curr=head;
        while(curr!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        Collections.reverse(list);
        long base=1;
      long ans=0;
      int i=0;
      while(i<list.size()){
          long temp=list.get(i);
          ans +=((base%mod)*temp)%mod;
          
          base=((base%mod)*2)%mod;
          i++;
      }
      
        return ans%mod;
   }
  
}
    
}

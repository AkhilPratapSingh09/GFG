import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {
    class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
       
        // s.reverse();
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=s.size()-1 ;i>=0;i--){
            ar.add(s.pop());
        }
        for(int i=0 ;i<ar.size();i++){
            s.push(ar.get(i));
        }
        
        
    }
    
}
}

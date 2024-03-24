public class bottomstack {
    class Solution {
        public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
            Stack<Integer> newstack=new Stack<>();
            while(!st.isEmpty()){
                newstack.push(st.pop());
            }
            st.push(x);
            while(!newstack.isEmpty()){
                st.push(newstack.pop());
            }
            return st;
        }
    }
    
    
}

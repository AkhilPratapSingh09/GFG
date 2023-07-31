import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int u = q.remove();
            for(int j=0; j<adj.get(u).size(); j++) {
               int v = adj.get(u).get(j);
               if(!list.contains(v)){
                    list.add(v);
                    q.add(v);
               }
            }
        }
        return list;
        
    }
}
}

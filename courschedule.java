import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class courschedule {
    class Solution
{
     static void recurse(int node ,ArrayList<ArrayList<Integer>> graph,boolean arr[],int visited[]){
        if(arr[0]){
            return ;
        }
        if(visited[node]!=0){
            if(visited[node]==1){
                arr[0] = true;
                return;
            }
            return ;
        }
        visited[node]=1;
        for(int e:graph.get(node)){
            recurse(e,graph,arr,visited);
        }
        visited[node]=2;
    }
    static boolean havingCycle(ArrayList<ArrayList<Integer>> graph){
        boolean arr[] = new boolean[1];
        int visited[] = new int[graph.size()];
        recurse(0,graph,arr,visited);
        return arr[0];
    }
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        int[] inDegree = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (ArrayList<Integer> prerequisite : prerequisites) {
            int u = prerequisite.get(1);
            int v = prerequisite.get(0);
            inDegree[v]++;
            graph.get(u).add(v);
        }
        if(havingCycle(graph)){
            return new int[]{};
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);
            index++;
            
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }
        
        if (index == n) {
            int[] order = new int[n];
            for (int i = 0; i < n; i++) {
                order[i] = result.get(i);
            }
            return order;
        } else {
            return new int[0];
        }
    }
}
}

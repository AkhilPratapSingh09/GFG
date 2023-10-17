import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class transitivegraph {
    class Solution{
   static ArrayList<ArrayList<Integer>> transitiveClosure(int n, int graph[][])
   {
       // code here
       ArrayList<ArrayList<Integer>> fin1=new ArrayList<ArrayList<Integer>>();
       int[][] fin=new int[n][n];
       for(int i=0;i<n;i++){
           dfs(graph,fin,i);
       }
      
       for(int i=0;i<n;i++){
           fin1.add(new ArrayList<>());
           for(int j=0;j<fin[i].length;j++){
               // System.out.print(fin[i][j]);
               fin1.get(i).add(fin[i][j]);
           }
           // System.out.println();
       }
       return fin1;
       
   }
   static void dfs(int[][] graph,int[][] fin,int curr_ver){
       Vector<Boolean> visited=new Vector<>(graph.length);
       for(int i=0;i<graph.length;i++){
           visited.add(false);
       }
       Stack<Integer> stack=new Stack<>();
       stack.push(curr_ver);
       while(stack.size()>0){
           int v=stack.pop();
           if(visited.get(v)==false){
               fin[curr_ver][v]=1;
               visited.set(v,true);
                   for(int i=0;i<graph.length;i++){
                   if(graph[v][i]==1){
                       stack.push(i);
                   }
               }
           }
           
       }
   }
   
}
}

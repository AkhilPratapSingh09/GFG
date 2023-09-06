public class MotherVertex {
    class Solution {
        public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
            boolean[] vis = new boolean[V];
            int mV = -1;
            for (int i = 0; i < V; i++) {
                if (!vis[i]) {
                    dfs(adj, i, vis);
                    mV = i;
                }
            }
            Arrays.fill(vis, false);
            dfs(adj, mV, vis);
            for (boolean val : vis) {
                if (!val) return -1;
            }
            return mV;
        }
        public void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] vis) {
            vis[v] = true;
            for (int it : adj.get(v)) {
                if (!vis[it]) {
                    dfs(adj, it, vis);
                }
            }
        }
    }
}

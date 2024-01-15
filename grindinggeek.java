import java.util.Arrays;

public class grindinggeek {
    class Solution {
    public int max_courses(int n, int total, int[] cost) {
        
        int dp[][] = new int[n][total + 1];
        for(int[] row : dp ){
            Arrays.fill(row , -1);
        }
        
        return solve(0 , total , cost , dp);
    }
    
     public int solve(int i, int total, int[] cost , int dp[][]){
         
         if(i == cost.length || total <= 0 ){
             return 0;
         }
         
         if(dp[i][total] != -1) return dp[i][total];
         
         int notake = solve(i + 1 , total , cost , dp);
         int take = 0;
         if(total >= cost[i]){
             take = 1 + solve(i + 1 , total - cost[i] + (int) Math.floor(cost[i] * 0.9) , cost , dp );
         }
         
         return dp[i][total] = Math.max(take , notake);
     }
}


}

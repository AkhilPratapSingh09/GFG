public class goodby {
    class Solution {
        public static boolean isPossible(int N, int[] coins) {
            // code here
            if(N==1){
                if(coins[0]==2024 || coins[0]%20==0 || coins[0]%24==0)return true;
                return false;
            }
            boolean[][] dp = new boolean[N+1][2025];
            for(int i=0;i<=N;i++){
                dp[i][0]=true;
            }
            for(int j=1;j<=N;j++){
                for(int i=1;i<2025;i++){
                  if(coins[j-1]>i){
                      dp[j][i]=dp[j-1][i];
                  }else if(dp[j-1][i] || dp[j-1][i-coins[j-1]]){
                      dp[j][i]=true;
                  }
                  if(dp[j][i] && (i%20==0 || i%24==0))return true;
                }
            }
            return dp[N][2024];
        }
    }
    
    
    
}

public class coinChange {
    
class Solution {
    public long coinChange(int ind, int Amount, int [] coins, long [][] dp){
        if(ind == coins.length){
            if(Amount == 0) return 1;
            return 0;
        } 
        if(dp[ind][Amount] !=-1) return dp[ind][Amount];
        long include=0, notinclude = 0;
        if(Amount >= coins[ind]){
            include = coinChange(ind, Amount-coins[ind], coins, dp);
        }
            notinclude = coinChange(ind+1, Amount, coins, dp);

            return dp[ind][Amount] = include + notinclude;
    }
    
    public long count(int coins[], int N, int sum) {
        long [][]dp = new long[N][sum+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }

        return coinChange(0, sum, coins, dp);
    }
}
}

public class knapsackduplicateitem {
    class Solution{
        static int knapSack(int N, int W, int val[], int wt[])
        {
        // code here
        int dp[][]=new int[N+1][W+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);
            return solve(N,W,val,wt,dp);
        }
        
        static int solve(int n,int w,int val[],int wt[],int dp[][]){
            
            if(n<=0 || w<=0)
                return 0;
                if(dp[n][w]!=-1)
                return dp[n][w];
                
            int notpick=solve(n-1,w,val,wt,dp);
            int pick=0;
            if(wt[n-1]<=w){
                pick+=val[n-1]+solve(n,w-wt[n-1],val,wt,dp); // Subtract wt[n-1] from w
            }
            return dp[n][w]=Math.max(pick,notpick);
        }
}

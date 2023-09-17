public class 17sep {
    class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long dp[] = new long[n];
        
        if(n==1){
            dp[0] = 1;
            return dp;
        }     
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
}
}

public class stairorf {
    class Solution {
        // Function to count number of ways to reach the nth stair
        // when order does not matter.
        Long countWays(int n) {
            // your code here
            if( n == 1)
            return (long)1;
            long dp[]=new long[n+1];
            dp[0]=0;
            dp[1]=1;
            dp[2]=2;
         
            for(int i=3;i<n+1;i++)
            {
                dp[i]=1+Math.min(dp[i-1],dp[i-2]);
            }
            return dp[n];
        }
    }
    
    
}

public class nthFib {
    class Solution {
        static int nthFibonacci(int n){
            // code here
            int dp[]= new int[2];
            dp[0]=0;
            dp[1]=1;
            for(int i=2;i<=n;i++){
                int temp=dp[1];
                dp[1]=(dp[0]+dp[1])%1000000007;
                dp[0]=temp;
            }
            return dp[1];
        }
    }
}

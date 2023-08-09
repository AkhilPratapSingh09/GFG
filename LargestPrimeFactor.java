public class LargestPrimeFactor {
    class Solution{
        static long largestPrimeFactor(int N) {
            // code here
            int ans=2;
            while(N%2==0)
            N=N/2;
            for(int i=3;i<=N;i+=2){
                if(N%i==0){
                    ans=i;
                    while(N%i==0)
                    N=N/i;
                }
            }
            return ans;
    
    }
    }
}

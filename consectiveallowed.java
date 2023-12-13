public class consectiveallowed {
    class Solution {
        long countStrings(int N) {
            // code here
            final int MOD = 1000000007;
    
            int[] count = new int[N + 1];
            int[] countOnes = new int[N + 1];
    
            count[1] = 1;
            countOnes[1] = 1;
    
            for (int i = 2; i <= N; i++) {
                count[i] = (count[i - 1] + countOnes[i - 1]) % MOD;
                countOnes[i] = count[i - 1];
            }
    
            return (count[N] + countOnes[N]) % MOD;
        }
    }
}

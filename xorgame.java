public class xorgame {
    class Solution {
        static int gameOfXor(int N, int[] A) {
            // code here
            int ans = 0;
            for (int i = 0; i < A.length; i++) {
                int contri = (i + 1) * (A.length - i);
                if (contri % 2 == 1) {
                    ans ^= A[i]; // Use XOR operator instead of multiplication
                }
            }
    
            return ans;
        }
    };
    
    
    
}

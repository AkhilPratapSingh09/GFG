public class EquilibriumPoint {
    class Solution {

    
        // a: input array
        // n: size of array
        // Function to find equilibrium point in the array.
        public static int equilibriumPoint(long arr[], int n) {
    
            // Your code here
            
             if (n == 1) {
                return (int) arr[0];
            }
    
            if (n == 2) {
                return -1;
            }
    
            long totalsum = 0;
    
            for (int i = 0; i < arr.length; i++) {
    
                totalsum += arr[i];
    
            }
    
            long leftsum = 0;
            long rightsum = 0;
            long prefixsum = 0;
            for (int i = 0; i < arr.length; i++) {
                prefixsum += arr[i];
                leftsum = prefixsum - arr[i];
                rightsum = totalsum - leftsum - arr[i];
    
                if (leftsum == rightsum) {
                    return i+1;
                }
    
            }
    
            return -1;
    
            
        }
    }
    
    
}

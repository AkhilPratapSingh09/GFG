public class PartitionEqual {
    static int equalPartition(int N, int arr[])
    {
        // code here
        
         int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If the total sum is odd, it can't be partitioned into two equal parts
        if (totalSum % 2 != 0) 
            return 0;
        

        int targetSum = totalSum / 2;
        int n = N;

        // Create a 2D boolean table dp[i][j]
        // where dp[i][j] will be true if there's a subset of elements in arr[0..i]
        // with a sum equal to j
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        // Initialize the first column as true, as an empty set can have a sum of 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                // If the current element (arr[i-1]) is greater than the sum j,
                // we can't include it in the subset
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Check if it's possible to either include or exclude the current element
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        // The answer will be in dp[n][targetSum]
        return dp[n][targetSum]?1:0;
    }
}

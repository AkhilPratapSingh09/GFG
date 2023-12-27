public class printdiagonally {
    class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int n = matrix.length;
        int[] ans = new int[n*n];
        int z = 0;
        for(int j = 0; j < n; j++){
            int k = j;
            for(int i = 0; i < j+1; i++){
                ans[z++] = matrix[i][k--];
            }
        }
        
        for(int i = 1; i < n; i++){
            int k = i;
            for(int j = n-1; j >= i; j--){
                ans[z++] = matrix[k++][j];
            }
        }
        return ans;
    }
}

    
}

public class SurroundingOnes {
    class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int n =  matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                 int count = 0;
                if(matrix[i][j] == 1){
                    //  checking 8 element
                    for(int nr = i-1; nr < i+2; nr++){
                        for(int nc = j-1; nc < j+2; nc++){
                            if(nr >= 0 && nr < n && nc >= 0 && nc < m && matrix[nr][nc] == 0){
                                count++;
                            }
                        }
                    }
                    if(count > 0 && count%2 == 0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
}

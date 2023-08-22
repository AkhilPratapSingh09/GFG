public class MakeMatrixBeautiful {
    class Solution {
        public static int findMinOperation(int n, int[][] matrix) {
            
            
            int row[]=new int[n];
            int col[]=new int[n];
            int maxSum=0;
            int ans=0;
            
            for(int i=0;i<n;i++){
                int rowSum=0;
                int colSum=0;
                for(int j=0;j<n;j++){
                    rowSum+=matrix[i][j];
                    colSum+=matrix[j][i];
                }
                row[i]=rowSum;
                col[i]=colSum;
                maxSum=Math.max(maxSum,rowSum);
                maxSum=Math.max(maxSum,colSum);
            }
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int canAdd=maxSum-Math.max(row[i],col[j]);
                    ans+=canAdd;
                    row[i]+=canAdd;
                    col[j]+=canAdd;
                }
            }
            
            return ans;
        }
    }
}

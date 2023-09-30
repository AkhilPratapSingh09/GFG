import java.util.Arrays;

public class BooleanMatrix {
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int r=matrix.length,c=matrix[0].length;
        int[] row=new int[r];
        int[] col=new int[c];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=1;
                }
            }
        }
    }
}

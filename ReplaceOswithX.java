public class ReplaceOswithX {
    class Solution{
        static char[][] fill(int n, int m, char a[][])
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if((i==0 ||i==n-1 || j==0||j==m-1)&& a[i][j]=='O')
                    {
                        dfs(a,i,j);
                    }
                }
            }
    
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j]!='k')
                    {
                        a[i][j]='X';
                    }
                    else{
                        a[i][j]='O';
                    }
                }
            }
            return a;
        }
        static void dfs(char mat[][],int i,int j)
        {
            if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j]!='O')
                return;
            mat[i][j]='k';
            dfs(mat,i+1,j);
            dfs(mat,i-1,j);
            dfs(mat,i,j+1);
            dfs(mat,i,j-1);
        }
    }
    
}

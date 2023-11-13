public class commonsubsequence {
    class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int t[][]=new int[m+1][n+1];
        char x[]=X.toCharArray();
        char y[]=Y.toCharArray();
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
                if(i>0 && j>0){
                    if(x[i-1]==y[j-1]){
                        t[i][j]=1+t[i-1][j-1];
                    }
                    else{
                        t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                    }
                }
            }
        }
        int res=m+n-t[m][n];
        return res;
    }
}
}

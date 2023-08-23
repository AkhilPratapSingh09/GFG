import java.util.ArrayList;
import java.util.Arrays;

public class StringGrid {
    class Solution
{
    
    public int[][] searchWord(char[][] grid, String word)
    {
        int n=grid.length;
        int m=grid[0].length;
        
        int dx[]={-1,0,0,1,-1,1,-1,1};
        int dy[]={0,-1,1,0,1,1,-1,-1};
        
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        int r=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<8;k++){
                    // System.out.println("Entered!");
                    if(valid(i,j,n,m,0,grid,word) && helper(i,j,k,0,n,m,word,dx,dy,grid)){
                        // System.out.println("lalalalala");
                        ans.add(i);
                        ans.add(j);
                        r++;
                        break;

                    }
                }
                
            }
        }
        // System.out.println();
        int res[][]=new int[r][2];
        int k=0;
        for(int i=0;i<ans.size();i+=2){
            res[k][0]=ans.get(i);
            res[k][1]=ans.get(i+1);
            k++;
        }
        Arrays.sort(res, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        return res;
    
        
        // Code here
    }
    public boolean valid(int x,int y,int n,int m ,int p,char grid[][],String word){
        if(x<0 || y<0 || x>=n || y>=m) return false;
        return grid[x][y]==word.charAt(p);
    }
    public boolean helper(int x,int y,int dir,int p,int n,int m,String word,int dx[],int dy[],char grid[][]){
        if(p==word.length()-1) return true;
        
        if(valid(x+dx[dir],y+dy[dir],n,m,p+1,grid,word)){
            return helper(x+dx[dir],y+dy[dir],dir,p+1,n,m,word,dx,dy,grid);
        }
        return false;
    }
}


}

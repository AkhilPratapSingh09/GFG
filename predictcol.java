public class predictcol {
    class Solution
{
    int columnWithMaxZeros(int M[][], int N)
    {
        
        // First method to solve
        
        // int columnWithMaxZeros(int arr[][] , int N)
        // code here 
        //   int curMax=0,ind=-1;
        // for(int j=0;j<N;j++)
        // {
        //     int max=0;
        //     for(int i=0;i<N;i++)
        //     {
        //         if(arr[i][j]==0)
        //         {
        //             max++;
        //         }
        //     }
        //     if(max>curMax)
        //     {
        //         ind=j;
        //         curMax=max;
        //     }
        // }
        
        // return ind;
        
        
        // Second method to solve
        
        int maxZeros = 0;
        int maxZeroColumn = -1;

        for (int j = 0; j < N; j++) {
            int zerosCount = 0;
            for (int i = 0; i < N; i++) {
                if (M[i][j] == 0) {
                    zerosCount++;
                }
            }

            if (zerosCount > maxZeros) {
                maxZeros = zerosCount;
                maxZeroColumn = j;
            }
        }

        return maxZeroColumn;
    }
}
}

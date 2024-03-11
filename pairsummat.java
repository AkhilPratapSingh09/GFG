public class pairsummat {
    class Solution {
        int countPairs(int mat1[][], int mat2[][], int n, int x) {
            int count=0;
            for (int i =0;i<n;i++){
                for(int j=0;j<n;j++){
                    int a=mat1[i][j];
                    int b=x-a;
                    for(int k=0;k<n;k++){
                        for(int l=0;l<n;l++){
                            if(mat2[k][l]==b){
                                count++;
                                
                                
                            }
                                
                                else if(mat2[k][l]>b){
                                    break;
                                }
                            
                        }
                    }
                    
                    
                }
            }
            
            return count;
            
            
            // code here
        }
    }
}

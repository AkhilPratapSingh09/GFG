public class mindistnum {
    class Solution {
        int minDist(int a[], int n, int x, int y) {
            int x_pos = -1;
            int y_pos = -1;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(a[i] == x){
                    x_pos = i;
                }
                if(a[i] == y){
                    y_pos = i;
                }
                if(x_pos!=-1 && y_pos!= -1){
                    min = Math.min(min,Math.abs(x_pos-y_pos));
                }
            }
            if(x_pos==-1 || y_pos== -1){
                return -1;
            }
            return min;
        }
    }
}

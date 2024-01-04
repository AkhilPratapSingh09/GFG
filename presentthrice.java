import java.util.Arrays;

public class presentthrice {
    class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        Arrays.sort(arr);
        for(int i = 0 ; i<N ;i+=3){
            if(i == N-1)
            return arr[i];
            if(arr[i]!=arr[i+2])
            return arr[i];
        }
        return -1;
    }
    
}
    
}

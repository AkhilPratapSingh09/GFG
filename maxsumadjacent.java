public class maxsumadjacent {
    class Solution {
        int findMaxSum(int arr[], int n) {
            // code here
            if(n==2)
            {
                return Math.max(arr[0],arr[1]);
            }
            int p1=0;
            int p2=arr[0];
            for(int i=1;i<n;i++)
            {
                int take=arr[i]+p1;
                int nottake=p2;
                p1=p2;
                p2=Math.max(take,nottake);
            }
            return p2;
        }
    }
    
}

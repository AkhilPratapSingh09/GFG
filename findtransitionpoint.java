public class findtransitionpoint {
    class Solution {
        int transitionPoint(int arr[], int n) {
            // code here
            int ans=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    ans+=1;
                }
                else if(arr[i]==1)
                {
                    return ans;
                }
            }
            
            return -1;
        }
    }
}

public class Sticklerthief {
    class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n==0) return 0;
        int prev1=0;
        int prev2=0;
        for(int ele : arr){
            int temp=prev1;
            prev1=Math.max(prev2+ele,prev1);
            prev2=temp;
        }
        return prev1;
    }
}
}

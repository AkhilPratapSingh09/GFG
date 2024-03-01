public class peakelementin {
    class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int i =0;
       int j = n-1;
       int ans = -1;
       while(i <= j){
           int mid = i+(j-i)/2;
           if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1])){
                return mid;
            }
           if(mid != n-1 && arr[mid] <= arr[mid+1]){
               ans = mid+1;
               i = mid+1;
           }else j = mid-1;
       }
       return ans;
    }
}

}

public class inorder {
    class Solution
{   static int isSorted(int arr[],int N){
        int start = arr[0];
        for(int i = 0;i<N;i++){
            if(arr[i]<start){
                return 0;
            }
            start = arr[i];
        }
        return 1;
    }
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        return isSorted(arr,N);
    }
}
}

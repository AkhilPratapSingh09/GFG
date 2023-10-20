public class numberdiv {
    class Solution {
        static int isPossible(int N, int arr[]) {
            int rem = 0;
            for(int i : arr){
                rem = (rem+i)%3;
            }
            return rem==0?1:0;
        }
    }
}

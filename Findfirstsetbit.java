public class Findfirstsetbit {
    class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        // Your code here
        for(int i=0;i<n;i++){
            if((n & (1<<i))!=0) return i+1;
        }
        return 0;
    }
}
}

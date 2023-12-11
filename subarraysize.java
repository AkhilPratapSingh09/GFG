import java.util.ArrayList;

public class subarraysize {
    class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0;
        for(int i=0;i<K;i++) sum+=Arr.get(i);
        long curr=sum;
        for(int i=K;i<N;i++) sum=Math.max(sum,curr+=Arr.get(i)-Arr.get(i-K));
        return sum;
    }
}
}

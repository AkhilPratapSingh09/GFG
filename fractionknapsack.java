import java.util.PriorityQueue;

public class fractionknapsack {
    class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double M = W;
        double ans=0.0;
        PriorityQueue<double[]> q = new PriorityQueue<>((a,b)-> Double.compare(b[2], a[2]));
        for(Item i: arr){
            double v = i.value;
            double w = i.weight;
            double r = v/w;
            q.add(new double[]{v,w,r});
        }
        
        while(!q.isEmpty() && M>0){
            double[] cur = q.poll();
            if(cur[1] <= M){
                ans += cur[0];
                M -= cur[1];
            }
            else{
                ans += (M*cur[2]);
                M = 0;
            }
        }
        
        return ans;
    }

}

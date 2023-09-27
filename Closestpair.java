import java.util.ArrayList;

public class Closestpair {
    class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int a=0, b=0;
        int i=0, j=m-1, res=Integer.MAX_VALUE;
        while(i<n && j>=0){
            int sum=arr[i]+brr[j];
            int diff=Math.abs(sum-x);
            if(res>diff){
                res=diff;
                a=arr[i];
                b=brr[j];
            }
            if(sum<x){
                i++;
            }
            else{
                j--;
            }
        }
        list.add(a);
        list.add(b);
        
        return list;
    }
}


}

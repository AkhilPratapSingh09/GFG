import java.util.*;
public class LeadersInArray {
    class Solution{
        static ArrayList<Integer> leaders(int arr[], int n){
            ArrayList<Integer> a=new ArrayList<>();
            int i=n-2;
            int max=arr[n-1];
           a.add(max);
            while(i>=0){
                if(arr[i]>=max){
                max=arr[i];
                a.add(max);
                }
                i--;
            }
           Collections.reverse(a);
            return a;
        }
    }
    
}

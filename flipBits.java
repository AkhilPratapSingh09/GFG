public class flipBits {
    
class Solution {

    public static int maxOnes(int a[], int n) {
         int max=0,count=0;
         int ans = 0;
         for(int i=0;i<n;i++){
             if(a[i]==0){
                 count++;
                 if( max < count){
                     max = count;
                 }
             }else{
                 ans++;
                 if(count>0)
                     count--;
             }
         }
         return ans+max;
     }
 }
 
}

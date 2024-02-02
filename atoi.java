public class atoi {
    class Solution
{
    int atoi(String s) {
    // Your code here
     int ans = 0;
     int pre=0;
     String sb = s;
     if(s.charAt(0)=='-'){
         pre++;
         sb = s.substring(1,s.length());
     }
     for(int i=0;i<sb.length();i++){
         if(sb.charAt(i)<48 || sb.charAt(i)>=58){
             return -1;
         }
         ans = ans*10+sb.charAt(i)-'0';
     }
     if(pre==1){
         return ans*-1;
     }
     return ans;
    }
}
}

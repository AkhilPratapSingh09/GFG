public class power {
    class Solution{
    
        // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(long n){
            
            // Your code here
              int i,max=Integer.MAX_VALUE;
            for(i=0;i<=100;i++)
            {
                if(Math.pow(2,i)==n)
                {
                    return true;
                }
            }
            return false;
    
    
            
        }
        
    }
}

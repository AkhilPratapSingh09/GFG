public class rightmostbit {

class Solution
{
    //Function to find the first position with different bits.
  public static int posOfRightMostDiffBit(int m, int n)
    {
        // Your code here  
        if(m==n) return -1;
        String s1 = Integer.toBinaryString(m);
        String s2 = Integer.toBinaryString(n);
        int max = Math.max(s1.length(), s2.length());
        for(int i=s1.length(); i<max; i++) s1 = "0"+s1;
        for(int i=s2.length(); i<max; i++) s2 = "0"+s2;
        for(int i=1; i<=max; i++){
            if(s1.charAt(max-i) != s2.charAt(max-i)) return i;
        }
        return -1;    
    }


}

    
}

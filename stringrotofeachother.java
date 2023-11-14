public class stringrotofeachother {
    class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        String ans=s2+s2;
        return ans.contains(s1);
    }
    
}


}

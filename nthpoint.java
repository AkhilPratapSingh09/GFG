public class nthpoint {
    class Solution
{
    public int nthPoint(int n)
    {
       int a=1,b=1,c;
       for(int i=1;i<n;i++)
       {
           c=(a+b)%1000000007;
           a=b;
           b=c;
       }
        return b;
    }
}
}

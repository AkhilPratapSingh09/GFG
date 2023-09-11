public class LuckyNumbers {
    class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {   int i=2;
        while(n%i!=0)
        {   if(n%i==0)  return false;//if N is divisible by i;
            if(n<i)     return true;//if N is less than i then it is a lucky number
            n=n-n/i++;//updating N for deleted values of the set
        }   return false;
    }
}
}

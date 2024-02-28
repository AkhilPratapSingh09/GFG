public class numbisdivby {
    class Solution{
        int DivisibleByEight(String s){
            return Integer.parseInt(s.substring(Math.max(s.length() - 3, 0))) % 8 == 0 ? 1 : -1;
        }
    }
}

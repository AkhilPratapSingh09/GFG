public class palindromneString {
    class Solution {
        int isPalindrome(String S) {
            StringBuilder str=new StringBuilder();
            char ch[]=S.toCharArray();
            for(int i=ch.length-1;i>=0;i--){
                str.append(ch[i]);
            }
            if(str.toString().equals(S)){
                return 1;
            }
            return 0;
        }
    };
}

import java.util.HashMap;

public class LongestKUniqueSubSeq {
    class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
              HashMap<Character,Integer> map = new HashMap<>();
        int ans=-1;
        int j=0,i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            while(map.size()>k&&j<=i){
                char ch2=s.charAt(j);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0) map.remove(ch2);
                j++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==k) ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}
}

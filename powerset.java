import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class powerset {
    class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
       List<String> ans=new ArrayList<>();
       
       subseq(s,"",0,ans);
       Collections.sort(ans);
       ans.remove(0);
       return ans;
    }
    void subseq(String s,String ns,int idx,List<String> ans){
        if(s.length()==idx){
           ans.add(ns);
            return;
        }
        
        char ch=s.charAt(idx);
        subseq(s,ns+ch,idx+1,ans);
        subseq(s,ns,idx+1,ans);
    }
}

}

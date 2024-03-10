import java.util.ArrayList;
import java.util.Collections;

public class removddup {
    class Solution {
    String removeDuplicates(String str) {
        ArrayList<Integer> ves = new ArrayList<>(Collections.nCopies(256, 0));
        StringBuilder ans = new StringBuilder(); 
        for(int i = 0; i < str.length(); i++) {
            if(ves.get(str.charAt(i)) == 1) {
                continue;
            } else {
                ves.set(str.charAt(i), 1);
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
}

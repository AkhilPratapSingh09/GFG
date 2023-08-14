import java.util.HashMap;

public class NonrepetingELe {
    class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            } else {
                map.put(nums[i],1);
            }
        }
        int k =0;
        for (int i : map.keySet()){
            ans[k] = i; k++;
        }
        if(ans[0] > ans[1]){
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        return ans;
    }
}
}

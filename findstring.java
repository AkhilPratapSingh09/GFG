public class findstring {
    class Solution{
        public String findString(int n, int k){
           
           StringBuilder ans = new StringBuilder();
           for(int i = 0; i < n; i++){
               ans.append('0'); // intiate with 0. because minimal n can be 1.
           }
           
           HashMap<String, Integer> map = new HashMap<>();
           map.put(ans.toString(), 1);// 1 is just for maintaing the hashmap requirements.
           
           int cnt = k-1;
           StringBuilder curr = new StringBuilder();
           curr.append(ans);
           
           
           while(true){
              StringBuilder temp = new StringBuilder(curr.substring(1));
              temp.append((char)(cnt + '0'));
             
              if(!map.containsKey(temp.toString())){
                  map.put(temp.toString(), 1);
                  ans.append((char)(cnt + '0'));
                  curr = temp;
                  cnt = k-1;
              }else{
                  cnt--;
              }
              if(cnt == -1){
                  break;
              }
           }
           
           return ans.toString();
        }
    }
    
    
}

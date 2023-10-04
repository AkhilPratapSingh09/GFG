public class RomantoInteger {
    class Solution {
        // Finds decimal value of a given roman numeral
        public int romanToDecimal(String s) {
            // code here
            HashMap<Character,Integer> map=new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int val=0;
            for(int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                val-=map.get(s.charAt(i)); 
            }
            else val+=map.get(s.charAt(i));
                
            }
            val+=map.get(s.charAt(s.length()-1));
            return val;
        }
    }
}

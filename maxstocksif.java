public class maxstocksif {
    class Pair{
        int day,price;
        Pair(int day,int price){
            this.day = day;
            this.price = price;
        }
    }
    
    class Solution {
        public static int buyMaximumProducts(int n, int k, int[] price) {
            ArrayList<Pair>arr = new ArrayList();
            for(int i=0;i<n;i++){
                arr.add(new Pair(i+1,price[i]));
            }
            Collections.sort(arr,(a,b)->{
                if(a.price-b.price==0){
                    return b.day-a.day;
                }
                return a.price-b.price;
            });
            int ans = 0;
            for(Pair p:arr){
                if(p.day*p.price<=k){
                    k-=p.day*p.price;
                    ans+=p.day;
                }
                else{
                    int d = p.day;
                    while(k>0 && d>0){
                        k-=p.price;
                        if(k>=0){
                            d--;
                            ans++;
                        }
                    }
                }
                if(k<=0) return ans;
            }
            return ans;
        }
    }
    
}

import java.util.ArrayList;

public class recamans {
        static ArrayList<Integer> recamanSequence(int n){
        int prev = 0, res = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        int i=0;
        while(++i<n){
            res = prev - i;
            if(res<0 || arr.contains(res)){
                res = prev + i;
            }
            arr.add(res);
            prev = res;
        }
        return arr;
    }
}
}

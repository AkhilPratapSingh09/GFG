public class transformtoprime {

class Solution
{
    public int minNumber(int arr[], int N)
    {
     boolean flag = false;
        int sum = 0;
        for(int i =0; i < N; i ++){
            sum = sum + arr[i];
        }
        int sum1 = sum;
        if(sum1 == 1){
            return 1;
        }
        while(sum1 > 0){
            flag = false;;
            for(int i = 2; i <= sum1 / 2; i++){
                if(sum1%i == 0){
                    flag = true;
                     break;
                }
            }
            if(flag){
                sum1 = sum1+1;
                continue;
            }
            break;
           
        }
        
        return sum1-sum;

    }
}

    
}

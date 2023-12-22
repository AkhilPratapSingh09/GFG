import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class meetingoneroom {
    
class Solution {

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {

        // code here

        ArrayList<Integer>l1=new ArrayList<Integer>();

        int array[][]=new int[N][3];

        for(int i=0;i<N;i++){

            array[i][0]=S[i];

            array[i][1]=F[i];

            array[i][2]=i+1;

            

        }

        Arrays.sort(array,Comparator.comparingInt(arr->arr[1]));

        int prev=-1;

        for(int i=0;i<N;i++){

            if(array[i][0]>prev){

                l1.add(array[i][2]);

                prev=array[i][1];

                

            }

        }

        Collections.sort(l1);

        return l1;

    }

}
    
}

public class uplowtriangle {
    class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        
        int diaSum = 0;
        int uppSum = 0;
        int lowSum = 0;
        
        ArrayList<Integer> sumList = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(i==j){
                    diaSum += matrix[i][j];
                }
                else{
                    uppSum += matrix[i][j];
                    lowSum += matrix[j][i];
                }
            }
        }
        sumList.add(diaSum+uppSum);
        sumList.add(diaSum+lowSum);
        return sumList;
    }
}
}

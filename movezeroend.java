public class movezeroend {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
   int count = 0; // Count of non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeroes
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    
    }
}

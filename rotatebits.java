import java.util.ArrayList;

public class rotatebits {
    class Solution
{
    ArrayList<Integer> rotate(int N, int D)
    {
        ArrayList<Integer> result = new ArrayList<>();

        // Ensure that D is within the range [0, 16] to handle edge cases
        D = D % 16;
        
        // Left rotation
        int leftRotated = (N << D) & 0xFFFF | (N >>> (16 - D));
        result.add(leftRotated);
        
        // Right rotation
        int rightRotated = (N >>> D) | (N << (16 - D)) & 0xFFFF; // Mask with 0xFFFF to keep only 16 bits
        result.add(rightRotated);

        return result;
    }
}
}

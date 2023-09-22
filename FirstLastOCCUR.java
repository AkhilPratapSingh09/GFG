public class FirstLastOCCUR {
    class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                first = Math.min(first, i);
                last = Math.max(last, i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        if (!found) {
            result.add(-1);
            result.add(-1);
        } else {
            result.add(first);
            result.add(last);
        }
        
        return result;
    }
}


}

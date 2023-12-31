public class ksympaths {
    

class Solution {
    private int count = 0;

    public int sumK(Node root, int k) {
        count = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Initialize with 0 to handle paths starting from the root
        calculatePaths(root, 0, k, prefixSumMap);
        return count;
    }

    private void calculatePaths(Node node, int currentSum, int k, HashMap<Integer, Integer> prefixSumMap) {
        if (node == null)
            return;

        currentSum += node.data;

        // Check if there exists a prefix sum such that currentSum - prefixSum equals K
        if (prefixSumMap.containsKey(currentSum - k))
            count += prefixSumMap.get(currentSum - k);

        // Update the prefix sum map
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        // Recursively check left and right subtrees
        calculatePaths(node.left, currentSum, k, prefixSumMap);
        calculatePaths(node.right, currentSum, k, prefixSumMap);

        // Backtrack by decrementing the count of currentSum to handle paths not passing through the current node
        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);
    }
}


}

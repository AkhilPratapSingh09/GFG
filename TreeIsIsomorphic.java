import org.w3c.dom.Node;

public class TreeIsIsomorphic {
    class Solution {
    boolean isIsomorphic(Node root1, Node root2) {
        // If both trees are empty, they are isomorphic
        if (root1 == null && root2 == null)
            return true;
        
        // If one of the trees is empty, they are not isomorphic
        if (root1 == null || root2 == null)
            return false;
        
        // Check if the data of the current nodes is the same
        if (root1.data != root2.data)
            return false;
        
        // Check for isomorphism recursively by considering two cases:
        // 1. The subtrees of root1 map to the subtrees of root2
        // 2. The subtrees of root1 map to the mirrored subtrees of root2
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) ||
               (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
    }
}
}

public class Symmetrictree {
    class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    private static boolean helper(Node l, Node r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        if (l.data != r.data) {
            return false;
        }
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
    public static boolean isSymmetric(Node root)
    {
        if(root == null) return true;
        return helper(root.left,root.right);
    }
}
}

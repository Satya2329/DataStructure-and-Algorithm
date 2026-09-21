package Tress_BinaryTrees;
public class LCADemo {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { 
            val = x; 
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    public static void main(String[] args) {

        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p1 = root.left;   
        TreeNode q1 = root.right;      
        TreeNode result1 = lowestCommonAncestor(root, p1, q1);
        System.out.println("LCA of 5 and 1: " + (result1 != null ? result1.val : "null")); 
        // Expected Output: 3

        TreeNode p2 = root.left.left;        
        TreeNode q2 = root.left.right.right;   
        TreeNode result2 = lowestCommonAncestor(root, p2, q2);
        System.out.println("LCA of 6 and 4: " + (result2 != null ? result2.val : "null")); 
        }
}
package Tress_BinaryTrees;
public class ValidateBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private static boolean validate(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if ((low != null && node.val <= low) || (high != null && node.val >= high)) {
            return false;
        }

        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        System.out.println("Is valid BST (Tree 1): " + isValidBST(root1));

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        System.out.println("Is valid BST (Tree 2): " + isValidBST(root2));
    }
}
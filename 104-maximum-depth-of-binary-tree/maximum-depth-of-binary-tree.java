/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
         if (root == null) {
            return 0;
        }

        // Recursively compute the depth of the left subtree.
        int leftDepth = maxDepth(root.left);

        // Recursively compute the depth of the right subtree.
        int rightDepth = maxDepth(root.right);

        // The depth of the current node is the greater of its two children's depths plus one.
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
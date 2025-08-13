/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If the root is null or root is either p or q, then root is the LCA
        if (root == null || root == p || root == q) return root;
      
        // Recurse on the left subtree to find the LCA of p and q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Recurse on the right subtree to find the LCA of p and q
        TreeNode right = lowestCommonAncestor(root.right, p, q);
      
        // If finding LCA in the left subtree returns null, the LCA is in the right subtree
        if (left == null) return right;
        // If finding LCA in the right subtree returns null, the LCA is in the left subtree
        if (right == null) return left;
      
        // If both left and right are non-null, we've found the LCA at the root
        return root;  
    }
}
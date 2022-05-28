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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        return Math.abs(depth(root.right) - depth(root.left)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }
    
    int depth(TreeNode root){
        
        if(root == null)
            return 0;
        
        return 1 + Math.max(depth(root.right), depth(root.left));
    }
}
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
    static int res;
    
    public int maxPathSum(TreeNode root) {
        res = Integer.MIN_VALUE;
        findMax(root, res);
        return res;
    }
    
    int findMax(TreeNode root, int res){
        if (root == null)
            return 0;

        int left = Math.max(0, findMax(root.left, res));
        int right = Math.max(0, findMax(root.right, res));
        Solution.res = Math.max(left + right + root.val, Solution.res);

        return Math.max(left, right) + root.val;
    }
}
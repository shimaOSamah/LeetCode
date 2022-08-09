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
class Solution{
    int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {       
        countLeft(root, 'h');
        return count;
    }
    
    void countLeft(TreeNode root, char p){
        
        if(root == null)
            return;
        
        if(root.left == null && root.right == null && p =='l'){
            count+= root.val;
            return;
        }
            
        
        countLeft(root.left, 'l');
        countLeft(root.right, 'r');
    }
}
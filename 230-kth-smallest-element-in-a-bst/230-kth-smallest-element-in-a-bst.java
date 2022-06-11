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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode temp = root;
        Stack <TreeNode> s = new Stack<TreeNode>();
        
        while(s.size() > 0 || temp != null){
            while(temp != null){
                s.add(temp);
                temp = temp.left;
            }
            
            temp = s.pop();
            k--;
            if(k == 0)
                return temp.val;
            
            temp = temp.right;
        }
        
        return -1;
    }
}
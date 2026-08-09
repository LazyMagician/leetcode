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
    public Integer maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode node){
        if(node == null) return 0;

        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);

        int pathThrough = node.val;
        pathThrough += Math.max(leftMax,0);
        pathThrough += Math.max(rightMax,0);
        maxSum = Math.max(maxSum,pathThrough);
        
        return Math.max(node.val,Math.max(node.val+leftMax,node.val+rightMax));
    }
}
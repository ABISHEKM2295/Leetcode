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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }
    private int dfs(TreeNode node){
        if(node==null) return 0;
        int left=dfs(node.left);
        int right=dfs(node.right);
        int leftp=0,rightp=0;
        if(node.left!=null && node.left.val==node.val){
            leftp=left+1;
        }
        if(node.right!=null && node.right.val==node.val){
            rightp=right+1;
        }
        max=Math.max(max,leftp+rightp);
        return Math.max(leftp,rightp);
    }
}
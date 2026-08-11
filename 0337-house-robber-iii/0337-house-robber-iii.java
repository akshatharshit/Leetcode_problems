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
    public int[] sol(TreeNode r){
       if(r==null)return new int[]{0,0};
       int l[]=sol(r.left);
       int ri[]=sol(r.right);
       int ta=r.val+l[1]+ri[1];
       int nt=Math.max(l[1],l[0])+Math.max(ri[1],ri[0]);
       return new int[]{ta,nt};
    }
    public int rob(TreeNode root) {
        int ans[]=sol(root);
        return Math.max(ans[0],ans[1]);
    }
}
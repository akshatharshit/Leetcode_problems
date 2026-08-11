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
    int ans=0;
    public int[] solve(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int l[]=solve(root.left);
        int r[]=solve(root.right);
        if(l[1]==1 || r[1]==1){
            ans++;
            return new int[]{1,0};
        }
        else if(l[0]==1 || r[0]==1){
            return new int[]{0,0};
        }
        else{
            return new int[]{0,1};
        }
    }
    public int minCameraCover(TreeNode root) {
        int a[]=solve(root);
        if(a[1]==1){
            ans++;
        }
        return ans;
    }
}
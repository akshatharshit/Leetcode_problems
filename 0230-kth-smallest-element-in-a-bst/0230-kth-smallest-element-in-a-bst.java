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
    int ans=-1;
    int c=0;
    public void sol(TreeNode root,int k){
        if(root==null)return;
        sol(root.left,k);
        c++;
        if(c==k){
            ans=root.val;
            return;
        }
        sol(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        sol(root,k);
        return ans;
    }
}
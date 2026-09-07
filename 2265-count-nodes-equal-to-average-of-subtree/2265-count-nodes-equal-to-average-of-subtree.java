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
    public int c(TreeNode r){
        if(r==null)return 0;
        return 1+c(r.left)+c(r.right);
    }
    public int sum(TreeNode r){
        if(r==null)return 0;
        int le=sum(r.left);
        int ri=sum(r.right);
        return r.val+le+ri;
    }
    int ans=0;
    public void sol(TreeNode r){
        if(r==null)return;
        if(r.val==(sum(r)/c(r))){
            ans++;
        }
        sol(r.left);
        sol(r.right);
    }
    public int averageOfSubtree(TreeNode root) {
        sol(root);
        return ans;
    }
}
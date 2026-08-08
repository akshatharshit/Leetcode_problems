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
    TreeNode f=null;
    TreeNode s=null;
    TreeNode pre=null;
    public void in(TreeNode r){
        if(r==null)return;
        in(r.left);
        if(pre!=null && pre.val>r.val){
            if(f==null)f=pre;
            s=r;
        }
        pre=r;
        in(r.right);
    }
    public void recoverTree(TreeNode root) {
        in(root);
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
    }
}
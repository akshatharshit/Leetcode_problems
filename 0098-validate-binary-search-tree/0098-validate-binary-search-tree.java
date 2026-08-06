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
    public boolean sol(TreeNode r,Long min ,Long max){
        if(r==null)return true;
        // if(min!=Integer.MIN_VALUE && r.val<=min)return false;
        // if(max!=Integer.MAX_VALUE && r.val>=max)return false;
        if(min!=null && (long)r.val<=min)return false;
        if(max!=null && (long)r.val>=max)return false;
        return sol(r.left,min,(long)r.val)&&sol(r.right,(long)r.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null)return true;
        // return sol(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return sol(root,null,null);
    }
}
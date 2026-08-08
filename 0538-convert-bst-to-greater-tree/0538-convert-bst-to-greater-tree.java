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
    int s=0;
    public void RevIn(TreeNode r){
        if(r==null)return;
        RevIn(r.right);
        s+=r.val;
        r.val=s;
        RevIn(r.left);
    }
    public TreeNode convertBST(TreeNode root) {
        RevIn(root);
        return root;
    }
}
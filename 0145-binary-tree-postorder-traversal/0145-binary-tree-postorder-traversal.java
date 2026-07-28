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
    List<Integer> ans;
    public void sol(TreeNode r){
        if(r==null)return;
        sol(r.left);
        sol(r.right);
        ans.add(r.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ans=new ArrayList<>();
        sol(root);
        return ans;
    }
}
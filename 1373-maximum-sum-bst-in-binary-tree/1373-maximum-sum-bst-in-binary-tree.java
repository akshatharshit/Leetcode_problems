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
    int ms=0;
    class Info{
        boolean isBst;
        int min;
        int max;
        int sum;
        Info(boolean isBst,int min,int max,int sum){
            this.isBst=isBst;
            this.min=min;
            this.max=max;
            this.sum=sum;
        }
    }
    public Info sol(TreeNode root){
        if(root==null)return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        Info le=sol(root.left);
        Info ri=sol(root.right);

        if(le.isBst && ri.isBst && le.max<root.val && root.val<ri.min){
            int su=le.sum+root.val+ri.sum;
            ms=Math.max(ms,su);
            int min=Math.min(root.val,le.min);
            int max=Math.max(root.val,ri.max);
            return new Info(true,min,max,su);
        }

        return new Info(false,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    }
    public int maxSumBST(TreeNode root) {
        sol(root);
        return ms;
    }
}
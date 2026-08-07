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
    public TreeNode sol(int[]a,int i,int j){
        if(i>j)return null;
        int m=i+(j-i)/2;
        TreeNode r=new TreeNode(a[m]);
        r.left=sol(a,i,m-1);
        r.right=sol(a,m+1,j);
        return r;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sol(nums,0,nums.length-1);
    }
}
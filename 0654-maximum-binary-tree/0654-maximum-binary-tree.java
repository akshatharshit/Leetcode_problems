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
    public int[] findId(int[]a,int i,int j){
        int id=i;
        int mx=a[i];
        for(int k=i;k<=j;k++){
            if(a[k]>mx){
                mx=a[k];
                id=k;
            }
        }
        return new int[]{id,mx};
    }
    public TreeNode sol(int[]a,int i,int j){
        if(i>j){
            return null;
        }
        int v[]=findId(a,i,j);
        TreeNode root=new TreeNode(v[1]);
        root.left=sol(a,i,v[0]-1);
        root.right=sol(a,v[0]+1,j);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return sol(nums,0,nums.length-1);
    }
}
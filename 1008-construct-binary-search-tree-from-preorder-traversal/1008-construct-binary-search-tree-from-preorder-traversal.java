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
    // public TreeNode insert(TreeNode r,int v){
    //     if(r==null)return new TreeNode(v);
    //     if(r.val>v){
    //         r.left=insert(r.left,v);
    //     }else if(r.val<v){
    //         r.right=insert(r.right,v);
    //     }
    //     return r;
    // }
    int i=0;
    public TreeNode sol(int a[],int b){
        if(i==a.length || a[i]>b)return null;
        TreeNode r=new TreeNode(a[i++]);
        r.left=sol(a,r.val);
        r.right=sol(a,b);
        return r;
    }
    public TreeNode bstFromPreorder(int[] p) {
        // TreeNode r=null;
        // for(int i: p)r=insert(r,i);
        // return r;

        return sol(p,Integer.MAX_VALUE);
    } 
}
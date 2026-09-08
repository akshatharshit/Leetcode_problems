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
    List<Integer> l=new ArrayList<>();
    public void sol(TreeNode root){
        if(root==null)return;
        sol(root.right);
        l.add(root.val);
        sol(root.left);
    }
    public int[] findMode(TreeNode root) {
        sol(root);
        int c=0;
        Map<Integer,Integer> m=new HashMap<>();
        int ma=-1;
        for(int i: l){
            m.put(i,m.getOrDefault(i,0)+1);
            ma=Math.max(ma,m.get(i));
        }
        l.clear();
        for(int i: m.keySet()){
            if(m.get(i)==ma){
                l.add(i);
            }
        }
        int[] res=new int[l.size()];
        int k=0;
        for(int i: l)res[k++]=i;
        return res;
    }
}
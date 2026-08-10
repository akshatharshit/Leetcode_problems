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
    Map<Integer,TreeNode> m=new HashMap<>();
    Set<Integer> vis=new HashSet<>();
    Set<Integer> child=new HashSet<>();
    public void merge(TreeNode r){
        if(r==null)return;
        if(r.left==null && r.right==null){
            if(m.containsKey(r.val) && !vis.contains(r.val)){
                TreeNode t=m.get(r.val);
                r.left=t.left;
                r.right=t.right;
                vis.add(r.val);
                //imp part
                merge(r.left);
                merge(r.right);
            }
            return;
        }
        merge(r.left);
        merge(r.right);
    }
    public boolean isBst(TreeNode r,Long min,Long max){
        if(r==null)return true;
        if(min!=null && r.val<=min)return false;
        if(max!=null && r.val>=max)return false;
        return isBst(r.left,min,(long)r.val)&&isBst(r.right,(long)r.val,max);
    }
    public TreeNode canMerge(List<TreeNode> trees) {
        for(TreeNode i: trees){
            m.put(i.val,i);
        }
        for(TreeNode i: trees){
            if(i.left!=null)child.add(i.left.val);
            if(i.right!=null)child.add(i.right.val);
        }
        TreeNode r=null;
        int c=0;
        for(TreeNode i: trees){
            if(!child.contains(i.val)){
                r=i;
                c++;
            }
        }
        if(c!=1)return null;
        vis.add(r.val);
        merge(r);
        if(vis.size()!=trees.size())return null;
        if(!isBst(r,null,null))return null;
        return r;
    }
}
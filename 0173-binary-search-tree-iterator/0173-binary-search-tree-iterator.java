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
class BSTIterator {
    List<TreeNode> l=new ArrayList<>();
    int i=0;
    public void in(TreeNode r){
        if(r==null)return;
        in(r.left);
        l.add(r);
        in(r.right);
    }
    public BSTIterator(TreeNode root) {
        in(root);
    }
    
    public int next() {
        return l.get(i++).val;
    }
    
    public boolean hasNext() {
        return i<l.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
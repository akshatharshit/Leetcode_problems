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
 class P{
    TreeNode n;
    int h;
    P(TreeNode n,int h){
        this.n=n;
        this.h=h;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<P> q=new LinkedList<>();
        int ans=0;
        q.add(new P(root,0));
        while(!q.isEmpty()){
            int s=q.size();
            int v=q.peek().n.val;
            int l=0;
            int r=0;
            for(int i=0;i<s;i++){
                P np=q.poll();
                if(i==0)l=np.h;
                if(i==s-1)r=np.h;
                if(np.n.left!=null)q.add(new P(np.n.left,2*(np.h)+1));
                if(np.n.right!=null)q.add(new P(np.n.right,2*(np.h)+2));
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
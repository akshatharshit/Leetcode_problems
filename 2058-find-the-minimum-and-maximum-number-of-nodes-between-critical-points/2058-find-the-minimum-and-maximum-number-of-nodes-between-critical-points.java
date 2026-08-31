/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        ListNode cur=head.next;
        ListNode p=head;
        int c=1;
        while(cur!=null && cur.next!=null){
            if(cur.val>p.val && cur.val>cur.next.val){
                ans.add(c);
            }
            if(cur.val<p.val && cur.val<cur.next.val){
                ans.add(c);
            }
            p=cur;
            cur=cur.next;
            c++;
        }
        if(ans.size()<2)return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        int max=ans.get(ans.size()-1)-ans.get(0);
        for(int i=1;i<ans.size();i++){
            min=Math.min(min,ans.get(i)-ans.get(i-1));
        }
        return new int[]{min,max};
    }
}
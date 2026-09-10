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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right || left>right)return head;
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p=d;
        for(int i=1;i<left;i++){
            p=p.next;
        }
        ListNode s=p.next;
        ListNode cur=p.next;
        ListNode pre=null;
        for(int i=0;i<=right-left;i++){
            ListNode nx=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nx;
        }
        p.next=pre;
        s.next=cur;
        return d.next;
    }
}
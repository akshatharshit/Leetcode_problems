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
    public ListNode merg(ListNode l1,ListNode l2){
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                t.next=l1;
                l1=l1.next;
            }else{
                t.next=l2;
                l2=l2.next;
            }
            t=t.next;
        }
        if(l1!=null)t.next=l1;
        else t.next=l2;
        return d.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode s=head;
        ListNode f=head;
        ListNode p=null;
        while(f!=null && f.next!=null){
            p=s;
            s=s.next;
            f=f.next.next;
        }
        p.next=null;
        ListNode le=sortList(head);
        ListNode ri=sortList(s);
        return merg(le,ri);
    }
}
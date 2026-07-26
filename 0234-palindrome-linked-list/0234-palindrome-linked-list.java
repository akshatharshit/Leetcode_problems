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
    public ListNode rev(ListNode h){
        ListNode p=null;
        ListNode cur=h;
        ListNode nx=null;
        while(cur!=null){
            nx=cur.next;
            cur.next=p;
            p=cur;
            cur=nx;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode cur=head;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        s=rev(s);
        while(s!=null){
            if(s.val!=cur.val)return false;
            cur=cur.next;
            s=s.next;
        }
        return true;
    }
}
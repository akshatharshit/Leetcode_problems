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
    public ListNode oddEvenList(ListNode head) {
        ListNode de=new ListNode(-1);
        ListNode dod=new ListNode(-1);
        ListNode ev=de;
        ListNode od=dod;
        ListNode cur=head;
        int c=1;
        while(cur!=null){
            if(c%2!=0){
                od.next=cur;
                od=od.next;
            }else{
                ev.next=cur;
                ev=ev.next;
            }
            cur=cur.next;
            c++;
        }
        ev.next=null;
        od.next=de.next;
        return dod.next;
    }
}
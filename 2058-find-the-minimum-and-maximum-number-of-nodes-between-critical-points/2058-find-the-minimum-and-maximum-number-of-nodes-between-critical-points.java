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
    public int[] nodesBetweenCriticalPoints(ListNode head){
        ListNode cur=head.next;
        ListNode p=head;
        int c=1;
        int min=-1;
        int v1=-1;
        int v2=-1;
        boolean f=true;
        int cr=0;
        while(cur!=null && cur.next!=null){
            if((cur.val>p.val && cur.val>cur.next.val) || (cur.val<p.val && cur.val<cur.next.val)){
                cr++;
                if(v1==-1){
                    v1=c;
                }
                if(v2!=-1){
                    int d=c-v2;
                    if(min==-1 || d<min){
                        min=d;
                    }
                }
                v2=c;
            }
            p=cur;
            cur=cur.next;
            c++;
        }
        if(cr<2)return new int[]{-1,-1};
        return new int[]{min,v2-v1};
    }
}
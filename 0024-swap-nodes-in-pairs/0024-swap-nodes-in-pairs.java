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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy,curr=dummy.next;
        while(curr!=null && curr.next!=null){
            ListNode np=curr.next.next;
            ListNode sec=curr.next;
            sec.next=curr;
            curr.next=np;
            prev.next=sec;
            prev=curr;
            curr=np;
        }return dummy.next;
    }
}
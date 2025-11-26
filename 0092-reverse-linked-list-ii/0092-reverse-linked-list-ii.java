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
        if(head==null || head.next==null || left==right) return head;
        ListNode lefte=null,righte=null,prevleft=null,nextright=null;
        for(int i=0;i<left;i++){
            prevleft=lefte;
            if(lefte==null) lefte=head;
            else lefte=lefte.next;
        }
        for(int i=0;i<right;i++){
            if(righte==null) righte=head;
            else righte=righte.next;
            if(righte.next!=null) nextright=righte.next;
            else nextright=null;
        }
      //  if(righte.next!=null) nextright=righte.next;
        ListNode temp=lefte.next;
        while(lefte!=righte){
            lefte.next=nextright;
            nextright=lefte;
            lefte=temp;
            temp=temp.next;
        }
        lefte.next=nextright;
        if(prevleft!=null) prevleft.next=lefte;
        else head=lefte;
        return head;
    }
}
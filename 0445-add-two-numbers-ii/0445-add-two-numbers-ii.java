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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=reverse(l1);
        ListNode temp2=reverse(l2);
        ListNode res=new ListNode(0);
        ListNode tail=res;
        int sum=0,carry=0;
        while(temp1!=null || temp2!=null){
            if(temp1==null) sum=temp2.val+carry;
            else if(temp2==null) sum=temp1.val+carry;
            else sum=temp1.val+temp2.val+carry;
            int rem=sum%10;
            tail.next=new ListNode(rem);
            tail=tail.next;
            carry=sum/10;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        } return reverse(res.next);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }return prev;
    }
}
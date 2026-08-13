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
        ListNode res=new ListNode(0);
        ListNode temp1=l1,temp2=l2,tail=res;
        int sum=0,carry=0;
        while(temp1!=null || temp2!=null){
            if(temp1==null) sum=temp2.val+carry;
            else if(temp2==null) sum=temp1.val+carry;
            else sum=temp1.val+temp2.val+carry;
            int rem=sum%10;
            carry=sum/10;
            tail.next=new ListNode(rem);
            tail=tail.next;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry >0) tail.next=new ListNode(carry);
        return res.next;
    }
}
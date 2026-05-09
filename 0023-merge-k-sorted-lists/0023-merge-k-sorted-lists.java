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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        List<Integer> li=new ArrayList<>();
        for(ListNode head:lists){
            while(head!=null){
                li.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(li);
        for(int val:li){
            tail.next=new ListNode(val);
            tail=tail.next;
        }
        return dummy.next;
    }
}
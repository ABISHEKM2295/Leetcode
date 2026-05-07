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
    public int pairSum(ListNode head) {
        List<Integer> li=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        ListNode curr=head;
        int len=0;
        while(curr != null){
            len++;
            li.add(curr.val);
            curr=curr.next;
        }
        for(int i=0; i < (len/2);i++){
            int idx=len-1-i;
            max=Math.max(max, li.get(i)+li.get(idx));
        }return max;
    }
}
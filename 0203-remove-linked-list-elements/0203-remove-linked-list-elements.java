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
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            if(curr.val==val)
                prev.next=next;
            else
                prev=curr;
            curr=next;
        }
        return dummy.next;
    }
}
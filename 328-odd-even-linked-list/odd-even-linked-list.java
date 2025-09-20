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
        if(head==null || head.next==null) return head;
        ListNode o=head;
        ListNode e=head.next;
        ListNode evenHead=e;
        while(e!=null && e.next!=null){
            o.next=e.next;
            o=e.next;
            e.next=o.next;
            e=o.next;
           
        }
        o.next=evenHead;
        return head;

        
    }
}
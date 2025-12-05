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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        return reverseK(head, k);
    }

    private ListNode reverseK(ListNode head, int k) {

        if (head == null) return null;

        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        int count = 0;

        // Check if at least k nodes exist
        ListNode check = head;
        int nodes = 0;
        while (nodes < k && check != null) {
            check = check.next;
            nodes++;
        }
        if (nodes < k) return head;

        // Reverse first k nodes
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recurse for the rest
        if (next != null) {
            ListNode rest_head = reverseK(next, k);
            head.next = rest_head;
        }

        return prev;
    }
}

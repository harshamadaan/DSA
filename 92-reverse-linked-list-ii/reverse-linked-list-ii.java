class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) return head;

       
        ListNode dummy = new ListNode(0);
        dummy.next = head;

       
        ListNode leftPre = dummy;
        ListNode currNode = head;

        
        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        
        ListNode subListHead = currNode;

       
        ListNode preNode = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        
        leftPre.next = preNode;
        subListHead.next = currNode;

        return dummy.next;
    }
}

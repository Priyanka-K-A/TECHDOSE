class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr;
        while(head!=null)
        {
            curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }
}

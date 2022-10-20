//142. Linked List Cycle II
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast)
            {
                while(head!=fast)
                {
                    fast = fast.next;
                    head = head.next;
                }
                return head;
            }
        }
        return null;
    }
}

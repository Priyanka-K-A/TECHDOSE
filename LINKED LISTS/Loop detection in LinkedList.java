public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        while(n1!=null && n2!=null && n2.next!=null)
        {
            n2 = n2.next.next;
            n1 = n1.next;
            if(n1==n2)
                return true;
        }
        return false;
        
    }
}

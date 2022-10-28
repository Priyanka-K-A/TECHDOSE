class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2= new Stack<>();
        while(l1!=null)
        {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null)
        {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode res = null;
        int c = 0;
        int sum;
        while(!s1.isEmpty()||!s2.isEmpty()||c>0)
        {
            sum=0;
            if(!s1.isEmpty())
            {
                sum+=s1.pop();
            }
            if(!s2.isEmpty())
            {
                sum+=s2.pop();
            }
            sum+=c;
            ListNode head = new ListNode(sum%10);
            head.next = res;
            res = head;
            c = sum/10;
        }
        return res;
    }
}
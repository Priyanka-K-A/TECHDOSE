class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i:s.toCharArray())
        {
            if(!stack.isEmpty() && (stack.peek()==i-1||stack.peek()==i-2)){
                // System.out.println(stack.peek());
                // System.out.println((i-1) +" "+(i-2));
                stack.pop();
            }
                // stack.pop();
            else
                stack.push(i);
            // System.out.println(stack);
        }
        return stack.isEmpty();
    }
}

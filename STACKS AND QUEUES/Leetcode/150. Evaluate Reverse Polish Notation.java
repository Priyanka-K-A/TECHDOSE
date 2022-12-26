class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+"))
            {
                s.push(s.pop()+s.pop());
            }
            else if(tokens[i].equals("*"))
            {
                s.push(s.pop()*s.pop());
            }
            else if(tokens[i].equals("-"))
            {
                int n = s.pop();
                s.push(s.pop()-n);
            }
            else if(tokens[i].equals("/"))
            {
                int n = s.pop();
                s.push(s.pop()/n);
            }
            else
            {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}

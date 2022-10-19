class Solution {
    public int calculate(String s) {
        if(s.isEmpty()||s==null) return 0;
        Stack<Integer> st = new Stack<Integer>();
        int num=0;
        char sign = '+';
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                num = (num*10)+(s.charAt(i)-'0');
            if(!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))||i==s.length()-1)
            {
                if(sign=='+')
                    st.push(num);
                else if(sign=='-')
                    st.push(-num);
                else if(sign=='*')
                    st.push(st.pop()*num);
                else if(sign=='/')
                    st.push(st.pop()/num);
                sign = s.charAt(i);
                num=0;
            }            
        }
        int res=0;
        while(!st.isEmpty())
            res += st.pop();
        return res;
    }
}

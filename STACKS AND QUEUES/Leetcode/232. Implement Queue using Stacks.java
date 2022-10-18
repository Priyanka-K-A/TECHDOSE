class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(s1.empty())
        {
            s1.push(x);
            return;
        }
        
        while(!s1.isEmpty())
            s2.push(s1.pop());
        
        s1.push(x);
        while(!s2.isEmpty())
           s1.push(s2.pop());
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}


class MinStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || minStack.peek() >= value)
            minStack.push(value);
    }
    
    public void pop() {
        int topEle =stack.pop();
        if(minStack.peek() == topEle)
            minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
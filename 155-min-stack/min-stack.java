class MinStack {

    List<Integer> stack = new ArrayList<>();
    List<Integer> minStack = new ArrayList<>();
    int stackLen = 0;
    int minStackLen = 0;
    public MinStack() {
    }
    
    public void push(int value) {
        stack.add(value);
        stackLen++;
        if(minStackLen == 0 ){
            minStack.add(value);
            minStackLen++;
        }
        else if( minStack.get(minStackLen-1) >= value){
            minStack.add(value);
            minStackLen++;
        }
    }
    
    public void pop() {
        int topEle = stack.get(stackLen-1);
        stack.remove(stackLen-1);
        stackLen--;
        if(minStackLen != 0 && minStack.get(minStackLen-1) == topEle){
            minStack.remove(minStackLen-1);
            minStackLen--;
        }    
    }
    
    public int top() {
       return  stack.get(stackLen-1);
    }
    
    public int getMin() {
        if(minStackLen != 0)
            return  minStack.get(minStackLen-1);
        else
            return 0;
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
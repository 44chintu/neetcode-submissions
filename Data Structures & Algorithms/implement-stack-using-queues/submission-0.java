class MyStack {
    Stack<Integer> st;
    public MyStack() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(!st.isEmpty()){
            int ele = st.pop();
            return ele;
        }
        return -1;
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
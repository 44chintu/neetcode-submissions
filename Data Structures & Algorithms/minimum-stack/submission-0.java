class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()){
            minst.push(val);
        }
        else{
        minst.push(Math.min(minst.peek(),val));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minst.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minst.isEmpty()){
            return minst.peek();
        }
        return -1;
    }
}

class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> al;
    public StockSpanner() {
        st = new Stack<>();
        al = new ArrayList<>();
    }
    
    public int next(int price) {
        al.add(price);
        int i=al.size()-1;
        while(!st.isEmpty() && price>=al.get(st.peek())){
            st.pop();
        }
        if(st.isEmpty()){
            st.push(i);
            return i+1;
        }
        else{
            int ele = i-st.peek();
            st.push(i);
            return ele;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
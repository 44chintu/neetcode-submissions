class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                if(st.size()>=2){
                    int temp = st.pop();
                    int sum = st.peek() + temp;
                    st.push(temp);
                    st.push(sum);
                }
            }
            else if(s.equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(s.equals("D")){
                if(!st.isEmpty()){
                    st.push(st.peek()*2);
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int count=0;
        for(int i:st){
            count+=i;
        }
        return count;
    }
}
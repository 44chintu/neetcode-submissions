class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids){
            while(!st.isEmpty() && i<0 && st.peek()>0){
                if((-1*i)>st.peek()){
                    st.pop();
                }
                else if((-1*i)==st.peek()){
                    st.pop();
                    i=0;
                    break;
                }
                else{
                    i=0;
                    break;
                }
            }
            if(i!=0){
                st.push(i);
            }
        }
        int res[] = new int[st.size()];
        for(int i=0;i<st.size();i++){
            res[i] = st.get(i);
        }
        return res;
    }
}
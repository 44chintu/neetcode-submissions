class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids){
            boolean end=false;
            while(!st.isEmpty() && end==false && i<0 && st.peek()>0){
                if((-1*i)>st.peek()){
                    st.pop();
                }
                else if((-1*i)==st.peek()){
                    st.pop();
                    end=true;
                }
                else{
                    end=true;
                }
            }
            if(end==false){
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
class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                if((Character.isUpperCase(ch) && Character.isLowerCase(st.peek()) && Character.toLowerCase(ch)==st.peek() || Character.isLowerCase(ch) && Character.isUpperCase(st.peek()) && Character.toUpperCase(ch)==st.peek())){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.isEmpty() || st.peek()!='('){
                        return false;
                    }
                    else{
                        if(!st.isEmpty()) st.pop();
                    }
                }
                else if(ch=='}'){
                    if(st.isEmpty() || st.peek()!='{'){
                        return false;
                    }
                    else{
                        if(!st.isEmpty()) st.pop();
                    }
                }
                else{
                    if(st.isEmpty() || st.peek()!='['){
                        return false;
                    }
                    else{
                        if(!st.isEmpty()) st.pop();
                    }
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count=0;
            while(!st.isEmpty() && heights[i]>heights[st.peek()]){
                count++;
                st.pop();
            }
            res[i] = count;
            if(!st.isEmpty()){
                res[i]++;
            }
            st.push(i);
        }
        return res;
    }
}
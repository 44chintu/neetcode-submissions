class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty() || nums[st.peek()]>nums[i]){
                st.push(i);
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
                ans = Math.max(ans,i-st.peek());
                st.pop();
            }
        }
        return ans;

    }
}
//[]
//[6, 0, 8, 2, 1, 5]
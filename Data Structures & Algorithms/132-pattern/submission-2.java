class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            while((!st.isEmpty() && nums[i]>nums[st.peek()])){
                second = nums[st.pop()];
            }
            if(nums[i]<second){
                return true;
            }
            st.push(i);
        }
        return false;
    }
}

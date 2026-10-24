class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int h=0;
        int minLen=Integer.MAX_VALUE;
        int curSum=0;
        while(h<nums.length){
            curSum+=nums[h];
            while(curSum>=target){
                minLen=Math.min(minLen,(h-l+1));
                curSum-=nums[l];
                l++;
            }
            h++;
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
}
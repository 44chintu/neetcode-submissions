class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return maxK(nums,goal)-maxK(nums,goal-1);
    }
    public int maxK(int[] nums,int goal){
        if(goal<0) return 0;
        int l=0;
        int r=0;
        int count=0;
        int maxSum=0;
        while(r<nums.length){
            if(nums[r]==1) maxSum++;
            while(maxSum>goal){
                if(nums[l]==1) maxSum--;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;

    }
}
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maximum = Integer.MIN_VALUE;
        for(int i:nums){
            maximum = Math.max(maximum,i);
        }
        int l=0;
        int r=0;
        int maxAvailable=0;
        long count=0;
        while(r<nums.length){
            if(nums[r]==maximum) maxAvailable++;
            while(maxAvailable>=k){
                count+=nums.length-r;
                if(nums[l]==maximum) maxAvailable--;
                l++;
            }
            r++;
        }
        return count;
    }
}

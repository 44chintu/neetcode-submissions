class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0;
        int r=0;
        long maxSum=0;
        long curSum=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        while(r<nums.length){
            hs.put(nums[r],hs.getOrDefault(nums[r],0)+1);
            curSum+=nums[r];
            if((r-l+1)>k){
                hs.put(nums[l],hs.get(nums[l])-1);
                curSum-=nums[l];
                if(hs.get(nums[l])==0){
                    hs.remove(nums[l]);
                }
                l++;
            }
            if((r-l+1)==k && hs.size()==k){
                maxSum = Math.max(maxSum,curSum);
            }
            r++;
            

        }
        return maxSum;
    }
}

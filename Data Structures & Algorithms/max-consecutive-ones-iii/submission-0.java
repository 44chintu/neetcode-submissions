class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int h=0;
        int maxCons=0;
        int zeroCount=0;
        while(h<nums.length){
            if(nums[h]==0) zeroCount++;
            while(zeroCount>k){
                if(nums[l]==0){
                    zeroCount--;
                }
                l++;
            }
            maxCons = Math.max(maxCons,(h-l+1));
            h++;
        }
        return maxCons;
    }
}
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,(k-1));
    }

    public int atMost(int[] nums,int k){
        int l=0;
        int r=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int maxCount=0;
        while(r<nums.length){
            hs.put(nums[r],hs.getOrDefault(nums[r],0)+1);
            while(hs.size()>k){
                hs.put(nums[l],hs.get(nums[l])-1);
                if(hs.get(nums[l])==0) hs.remove(nums[l]);
                l++;
            }
            maxCount+=(r-l+1);
            r++;
        }
        return maxCount;
    }
}
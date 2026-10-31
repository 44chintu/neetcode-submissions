class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return maxK(nums,k)-maxK(nums,k-1);
    }
    public int maxK(int nums[],int k){
        int l=0;
        int r=0;
        int availableOdd=0;
        int count=0;
        while(r<nums.length){
            if(nums[r]%2==1) availableOdd++;
            while(availableOdd>k){
                if(nums[l]%2==1) availableOdd--;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}

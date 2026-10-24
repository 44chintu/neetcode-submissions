class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l=0;
        int h=0;
        int count=0;
        int curProduct=1;
        while(h<nums.length){
            curProduct*=nums[h];
            while(curProduct>=k){
                curProduct/=nums[l];
                l++;
            }
            count+=(h-l+1);
            h++;

        }
        return count;
    }
}
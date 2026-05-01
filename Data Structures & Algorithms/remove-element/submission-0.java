class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val){
                nums[l]=nums[k];
                l++;
            }
        }
        return l;
    }
}
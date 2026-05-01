class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int k=1;
        while(k<nums.length){
            if(nums[l]!=0){
                l++;
            }
            else if(nums[l]==0 && nums[k]!=0){
                int temp = nums[k];
                nums[k] = nums[l];
                nums[l] = temp;
                l++;
            }
            k++;
        }
    }
}
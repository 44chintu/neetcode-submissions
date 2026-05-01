class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int k=0;
        while(k<nums.length){
            if(nums[k]%2==0){
                int temp = nums[k];
                nums[k] = nums[l];
                nums[l] = temp;
                l++;
            }
            k++;
        }
        return nums;
    }
}
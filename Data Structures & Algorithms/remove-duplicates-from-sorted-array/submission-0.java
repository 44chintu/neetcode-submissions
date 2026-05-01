class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int k = 1;int count=1;
        while(k<nums.length){
            if(nums[l]!=nums[k]){
                nums[l+1] = nums[k];
                l++;
                count++;
            }
            k++;
        }
        return count;
    }
}
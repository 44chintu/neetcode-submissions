class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int k=numbers.length-1;
        while(l<k){
            if(numbers[l]+numbers[k]==target){
                return new int[] {l+1,k+1};
            }
            else if(numbers[l]+numbers[k]<target) l++;
            else k--;
        }
        return new int[] {-1,-1};
    }
}

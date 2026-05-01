class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int need=target-ele;
            if(hs.containsKey(need)){
                return new int[] {hs.get(need),i};
            }
            hs.put(ele,i);
        }
        return new int[] {-1,-1};
    }
}

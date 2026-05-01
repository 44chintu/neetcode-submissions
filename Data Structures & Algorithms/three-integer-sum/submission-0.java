class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){ // [-4,-1,-1,0,1,2]
            int ele = nums[i] * -1;
            int l=i+1;  // -1 
            int k=nums.length-1;
            while(l<k){
                if(nums[l]+nums[k]==ele){
                    ArrayList<Integer> found = new ArrayList<>();
                    found.add(nums[i]);
                    found.add(nums[l]);
                    found.add(nums[k]);
                    al.add(found);
                    while(l<k && nums[l]==nums[l+1]){
                    l++;
                    }
                    while(l<k && nums[k]==nums[k-1]){
                    k--;
                    }
                    l++;
                    k--;
                }
                else if(nums[l]+nums[k]<ele){
                    l++;
                }
                else{
                    k--;
                }
            }
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return al;
    }
}

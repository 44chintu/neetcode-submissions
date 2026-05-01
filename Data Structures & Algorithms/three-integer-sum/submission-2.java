class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int ele = -1*nums[i];
            int l = i+1;
            int k = nums.length-1;
            while(l<k){
                if(nums[l]+nums[k]==ele){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[k]);
                    ls.add(al);
                    l++;
                    k--;
                    while(l<k && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                else if(nums[l]+nums[k]<ele){
                    l++;
                }
                else{
                    k--;
                }
            }
        }
            return ls;
    }
}

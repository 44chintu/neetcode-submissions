class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;
        int pow[] = new int[nums.length];
        pow[0]=1;
        int mod = 1_000_000_007;
        for(int i=1;i<nums.length;i++){
            pow[i]=(pow[i-1]*2) % mod;
        }
        int l=0;
        int k = nums.length-1;
        while(l<=k){
            if(nums[l]+nums[k]<=target){
                count = (count+pow[k-l])%mod;
                l++;
            }
            else{
                k--;
            }
        }
        return count;
    }
}
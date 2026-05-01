class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i])+1);
            }
            else{
                hs.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> al = new ArrayList<>(hs.entrySet());
        al.sort((a,b)-> b.getValue()-a.getValue());
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=al.get(i).getKey();
        }
        return res;
    }
}

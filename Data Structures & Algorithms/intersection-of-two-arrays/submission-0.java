class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int ele:nums1){
            hs.add(ele);
        }
        for(int i=0;i<nums2.length;i++){
           if(hs.contains(nums2[i])){
               res.add(nums2[i]);
           }
        }
        int result[] = new int[res.size()];
        int i=0;
        for(int e:res){
            result[i++]=e;
        }
        return result;
         
    }
}
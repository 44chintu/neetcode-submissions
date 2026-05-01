class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int ele:nums){
            if(al.contains(ele)){
                return true;
            }
            al.add(ele);
        }
    return false;
    }
}
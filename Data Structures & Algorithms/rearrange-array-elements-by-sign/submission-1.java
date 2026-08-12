class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int n:nums){
            if(n>0){
                pos.add(n);
            }
            else{
                neg.add(n);
            }
        } // [3,1,2] [-2,-5,-4]
        int l=0;
        int k=0;
        int i=0;
        while(l<pos.size() && k<neg.size()){
                nums[i++]=pos.get(l++);
                nums[i++]=neg.get(k++);
            }
        return nums;
    }
}
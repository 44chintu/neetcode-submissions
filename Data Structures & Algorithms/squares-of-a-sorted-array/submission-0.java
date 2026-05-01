class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int ele:nums){
            if(ele<0){
                negatives.add(ele*ele);
            }
            else{
                positives.add(ele*ele);
            }
        }
        int i=negatives.size()-1;
        int j=0;
        int k=0;
        while(i>=0 && j<positives.size()){
            if(negatives.get(i)<positives.get(j)){
                result[k]=negatives.get(i);
                i--;
            }
            else{
                result[k]=positives.get(j);
                j++;
            }
            k++;
        }
        while(i>=0){
            result[k]=negatives.get(i);
            i--;
            k++;
        }
        while(j<positives.size()){
            result[k]=positives.get(j);
            j++;
            k++;
        }
        return result;
    }
}
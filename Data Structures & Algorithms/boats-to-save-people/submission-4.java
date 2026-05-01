class Solution {
    public int numRescueBoats(int[] people, int limit) {
        ArrayList<Integer> boats = new ArrayList<>();
        int count=0;
        Arrays.sort(people);
        int l=0;
        int k=people.length-1;
        while(l<=k){
            if(people[l]+people[k]<=limit){
                l++;
            }
            k--;
            count++;
        }
        
        return count;
    }
}
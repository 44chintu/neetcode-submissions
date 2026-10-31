class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int r=0;
        int maxSubarrays=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        while(r<s.length()){
            if(s.charAt(r)=='a') aCount++;
            else if(s.charAt(r)=='b') bCount++;
            else cCount++;
            while(aCount>=1 && bCount>=1 && cCount>=1){
                maxSubarrays+=s.length()-r;
                if(s.charAt(l)=='a') aCount--;
                else if(s.charAt(l)=='b') bCount--;
                else cCount--;
                l++;
            }
            r++;
        }
        return maxSubarrays;
    }
}

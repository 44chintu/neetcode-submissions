class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int maxFreq=0;
        HashMap<Character, Integer> hs = new HashMap<>();

        while(r<s.length()){
            hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,hs.get(s.charAt(r)));
            while((r-l+1)-maxFreq>k){
                hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
                if(hs.get(s.charAt(l))==0){
                    hs.remove(s.charAt(l));
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}

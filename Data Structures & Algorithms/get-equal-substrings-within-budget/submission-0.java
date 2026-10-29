class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int r=0;
        int curSum=0;
        int maxSum=0;
        while(r<s.length()){
            curSum+=Math.abs((s.charAt(r)-'a')-(t.charAt(r)-'a'));
            while(curSum>maxCost){
                curSum-=Math.abs((s.charAt(l)-'a')-(t.charAt(l)-'a'));
                l++;
            }
            maxSum=Math.max(maxSum,(r-l+1));
            r++;
        }
        return maxSum;
    }
}

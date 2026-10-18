class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = k-1;
        int maxCount=0;
        int currentCount=0;
        for(int i=l;i<=r;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                currentCount++;
            }
        }
        maxCount = currentCount;
        while(r<s.length()-1){
            if(s.charAt(l)=='a' || s.charAt(l)=='e' || s.charAt(l)=='i' || s.charAt(l)=='o' || s.charAt(l)=='u'){
                currentCount--;
            }
            l++;
            r++;
            if(s.charAt(r)=='a' || s.charAt(r)=='e' || s.charAt(r)=='i' || s.charAt(r)=='o' || s.charAt(r)=='u'){
                currentCount++;
            }
            maxCount = Math.max(maxCount,currentCount);
        }
        return maxCount;
    }
}

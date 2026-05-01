class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int k=0;
        int start=0;
        while(l<needle.length() && k<haystack.length()){
            if(needle.charAt(l)==haystack.charAt(k)){
                if(l==0){
                    start=k;
                }
                l++;
            if(l==needle.length()) return start;
            k++;
            }
            else{
                l=0;
                start++;
                k=start;
            }
        }
        return -1;
    }
}
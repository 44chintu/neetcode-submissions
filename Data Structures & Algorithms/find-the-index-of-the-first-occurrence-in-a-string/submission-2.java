class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int k=0;
        int index=-1;
        int count=0;
        while(l<needle.length() && k<haystack.length()){
            if(needle.charAt(l)==haystack.charAt(k)){
                if(index==-1){
                    index=k;
                }
                l++;
            }
            else{
                index=-1;
                l=0;
                k=count;
                count++;
            }
        k++;
        }
        if(l==needle.length()){
            return index;
        }
        return -1;
    }
}
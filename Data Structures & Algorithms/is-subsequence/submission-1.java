class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int l=0;
        int k=0;
        while(l<s.length() && k<t.length()){
            if(s.charAt(l)==t.charAt(k)){
                l++;
            }
            k++;
        }
        if(l==s.length()) return true;
        return false;
    }
}
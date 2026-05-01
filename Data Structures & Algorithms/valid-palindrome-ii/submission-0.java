class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int k=s.length()-1;
        while(l<k){
            if(s.charAt(l)==s.charAt(k)){
                l++;
                k--;
            }
            else{
                return validRemovedPallindrome(l+1,k,s) || validRemovedPallindrome(l,k-1,s);
            }
        }
        return true;
    }
    public boolean validRemovedPallindrome(int l,int k,String str){
        while(l<k){
            if(str.charAt(l)!=str.charAt(k)){
                return false;
            }
            l++;
            k--;
        }
        return true;
    }
}
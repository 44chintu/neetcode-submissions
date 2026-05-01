class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int k=s.length()-1;
        while(l<k){
            while(l<k && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<k && !Character.isLetterOrDigit(s.charAt(k))){
                k--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(k)) && l<k){
                return false;
            }
            l++;
            k--;
        }
        return true;
    }
}

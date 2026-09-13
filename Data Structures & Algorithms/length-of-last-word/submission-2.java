class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int l = s.length()-1;
        while(l>=0 && s.charAt(l)==' '){
            l--;
        }
        while(l>=0 && s.charAt(l)!=' '){
            l--;
            len++;
        }
        return len;
    }
}
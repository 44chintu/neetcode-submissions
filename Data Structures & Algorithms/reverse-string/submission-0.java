class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int k=s.length-1;
        while(l<k){
            char temp = s[l];
            s[l] = s[k];
            s[k] = temp;
            l++;
            k--;
        }
    }
}
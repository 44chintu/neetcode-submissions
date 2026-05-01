class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int count[] = new int[256];
        for(char ch:s.toCharArray()){
            count[ch]++;
        }
        for(char ch:t.toCharArray()){
            count[ch]--;
            if(count[ch]<0) return false;
        }

        return true;
    }
}

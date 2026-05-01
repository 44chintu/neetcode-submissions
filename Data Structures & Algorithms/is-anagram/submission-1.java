class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tch = t.toCharArray();
        Arrays.sort(sc); 
        Arrays.sort(tch);
        return Arrays.equals(sc,tch);
    }
}

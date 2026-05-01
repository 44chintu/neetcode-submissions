class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int l=0;
        int k=0;
        while(l<word1.length() && k<word2.length()){
            res.append(word1.charAt(l++));
            res.append(word2.charAt(k++));
        }
        while(l<word1.length()){
            res.append(word1.charAt(l++));
        }
        while(k<word2.length()){
            res.append(word2.charAt(k++));
        }
        return res.toString();
    }
}
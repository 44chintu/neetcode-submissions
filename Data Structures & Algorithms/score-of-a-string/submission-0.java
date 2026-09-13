class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=1;i<s.length();i++){
            int sum = Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
            score+=sum;
        }
        return score;
    }
}
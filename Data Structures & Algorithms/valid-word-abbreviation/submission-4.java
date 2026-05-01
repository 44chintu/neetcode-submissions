class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;
        while(i<abbr.length()){
            if(abbr.charAt(i)=='0'){
                return false;
            }
            else if(j<word.length() && i<abbr.length() && Character.isLetter(abbr.charAt(i)) && word.charAt(j)==abbr.charAt(i)){
                i++;
                j++;
            }
            else if(i<abbr.length() && Character.isDigit(abbr.charAt(i))){
                int num=0;
                while(i<abbr.length() && Character.isDigit(abbr.charAt(i))){
                    num=(num*10)+abbr.charAt(i)-'0';
                    i++;
                }
                j+=num;
            }
            else{
                return false;
            }
        }
        return j==word.length();
    }
}
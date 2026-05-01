class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder common = new StringBuilder();
        int i=0;
        boolean equal=true;
        while(equal){
            char ch;
            if(i<strs[0].length()){
                ch = strs[0].charAt(i);
            }
            else{
                equal=false;
                break;
            }
            for(String str:strs){
                if(i>=str.length()){
                    equal=false;
                    break;
                }
                if(!(str.charAt(i)==ch)){
                    return common.toString();
                }
            }
                if(equal) common.append(ch);
                i++;
        }
        if(common!=null) return common.toString();
        return "";
    }
}
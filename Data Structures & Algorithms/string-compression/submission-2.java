class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int writerPointer=0;
        for(int i=0;i<chars.length;i++){
            chars[writerPointer++] = chars[i];
            int count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                chars[writerPointer++]=c;
                }
            }
        }
        return writerPointer;
    }
}
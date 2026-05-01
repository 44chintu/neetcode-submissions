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
                int n = 0;
                while(count>0){
                    int rem = count%10;
                    n = (n*10)+rem;
                    count/=10;
                }
                while(n>0){
                    int rem = n%10;
                    chars[writerPointer++]=(char)('0'+rem);
                    n/=10;
                }
            }
        }
        return writerPointer;
    }
}
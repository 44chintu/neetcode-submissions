class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int r = k-1;
        int maxRecolors = 0;
        int currentRecolors = 0;
        for(int i=l;i<=r;i++){
            if(blocks.charAt(i)=='W') currentRecolors++;
        }
        maxRecolors = currentRecolors;
        while(r<blocks.length()-1){
            if(blocks.charAt(l)=='W') currentRecolors--;
            l++;
            r++;
            if(blocks.charAt(r)=='W') currentRecolors++;
            maxRecolors = Math.min(maxRecolors,currentRecolors);
        }
        return maxRecolors;
    }
}
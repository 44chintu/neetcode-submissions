class Solution {
    public int maxArea(int[] heights) {
        int maxAreaVar = 0;
        int l = 0;
        int k = heights.length-1;
        while(l<k){
            int minHeight = Math.min(heights[l],heights[k]);
            int area = minHeight * (k-l);
            maxAreaVar = Math.max(area,maxAreaVar);
            if(heights[l]<=heights[k]){
                l++;
            }
            else{
                k--;
            }
        }
        return maxAreaVar;
    }
}

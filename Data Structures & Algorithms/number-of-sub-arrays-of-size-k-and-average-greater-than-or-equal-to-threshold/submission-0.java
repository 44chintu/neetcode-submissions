class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int r=k-1;
        int count=0;
        int curSum=0;
        for(int i=l;i<=r;i++){
            curSum+=arr[i];
        }
        if((curSum/k)>=threshold) count++;
        while(r<arr.length-1){
            curSum-=arr[l];
            l++;
            r++;
            curSum+=arr[r];
            if((curSum/k)>=threshold) count++;
        }
        return count;
    }
}
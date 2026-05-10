class Solution {
    public int candy(int[] ratings) {
        int l=0;
        int k=ratings.length-1;
        int count=0;
        int countArr[] = new int[ratings.length];
        for(int i=0;i<countArr.length;i++){
            countArr[i] = 1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                countArr[i] = countArr[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(countArr[i]<=countArr[i+1]){
                    countArr[i] = countArr[i+1]+1;
                }
            }
        }
        for(int i:countArr){
            count+=i;
        }
        return count;

    }
}
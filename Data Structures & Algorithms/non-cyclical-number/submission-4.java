class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!=fast);
        return slow==1;
        
    }
    public static int findSquare(int num){
        int square = 0;
        while(num>0){
            int rem = num%10;
            square = square + (rem*rem);
            num/=10;
        }
        return square;
    }
}

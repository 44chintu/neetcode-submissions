class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        int square = -1;
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            square = 0;
            while(n>0){
                int rem = n%10;
                square = square+(rem*rem);
                n/=10;
            }
            n = square;
        }
        return n == 1;
        
    }
}

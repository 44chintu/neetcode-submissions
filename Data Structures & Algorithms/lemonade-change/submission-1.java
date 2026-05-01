class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollars= 0;
        int tenDollars = 0;
        int twentyDollars = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveDollars++;
            }
            else if(bills[i]==10){
                if(fiveDollars>=1){
                    fiveDollars--;
                    tenDollars++;
                }
                else{
                    return false;
                }
            }
            else{
                if(tenDollars>=1 && fiveDollars>=1){
                    tenDollars--;
                    fiveDollars--;
                }
                else if(fiveDollars>=3){
                    fiveDollars-=3;
                }
                else{
                    return false;
                }
                twentyDollars++;
            }
        }
        return true;
    }
}
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> dq = new ArrayDeque();
        for(String str:operations){
            if(str.equals("D")){
                if(!dq.isEmpty()){
                    dq.push(dq.peek()*2);
                }
            }
            else if(str.equals("C")){
                if(!dq.isEmpty()){
                    dq.pop();
                }
            }
            else if(str.equals("+")){
                if(dq.size()>=2){
                    int a = dq.peek();
                    dq.pop();
                    int b = dq.peek();
                    dq.push(a);
                    dq.push(a+b);
                }
            }
            else{
                dq.push(Integer.parseInt(str));
            }
        }
        int total=0;
        for(int i:dq){
            total+=i;
        }
        return total;
    }
}
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stPush = new Stack<>();
        int l=0;
        int k=0;
        while(l<pushed.length){
            stPush.push(pushed[l]);
            l++;
            while(!stPush.isEmpty() && stPush.peek()==popped[k]){
                stPush.pop();
                k++;
            }
        }
        return stPush.isEmpty();
    }
}

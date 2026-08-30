class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode l = head;
        ListNode k = head;
        while(k!=null && k.next!=null){
            l = l.next;
            k = k.next.next;
        }
        ListNode isOdd = k;
        k = l;
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=k){
            ListNode further = cur.next;
            cur.next = prev;
            prev = cur;
            cur = further;
        }
        l = prev;
        if(isOdd==null){
            k = cur;
        }
        else{
            k = cur.next;
        }
        while(l!=null && k!=null){
        if(l.val!=k.val) return false;
            l = l.next;
            k = k.next;
        }
        return (l==null && k==null);
    }
}
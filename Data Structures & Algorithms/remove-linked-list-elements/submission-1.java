class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head!=null){
            ListNode temp = head;
            while(temp!=null){
                if(temp.val==val){
                    temp = temp.next;
                    head = temp;
                }
                else if(temp.next!=null && temp.next.val==val){
                    if(temp.next.next!=null){
                        temp.next = temp.next.next;
                    }
                    else{
                        temp.next = null;
                    }
                }  
                else{
                    temp = temp.next;
                }
            }
        }
        return head;
    }
}
public class Q143 {
    public void reorderList(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            fast=fast.next;
        }
        slow.next=rev(slow.next,fast);
        ListNode one = head,two=slow.next;
        ListNode next1,next2;
        while(one!=null){
            if(one==slow){
                one.next=two;
                if(two!=null){
                    two.next=null;
                }
                break;
            }else{
                next1=one.next;
                next2=two.next;
                one.next=two;
                two.next=next1;
                one=next1;
                two=next2;
            }
        }

    }
    static ListNode rev(ListNode head,ListNode end){
        if(head==end){
            return head;
        }
        ListNode curr = head,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

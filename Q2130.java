public class Q2130 {
    public int pairSum(ListNode head) {
            ListNode fast=head,slow=head;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode other = slow.next;
            head=rev(head,other);
            int max = Integer.MIN_VALUE;
            while(other!=null){
                max=Math.max(head.val+ other.val,max);
                other=other.next;
                head=head.next;
            }
            return max;
    }
    static ListNode rev(ListNode head,ListNode end){
        if(head==end){
            return head;
        }
        ListNode curr = head,prev=end,next;
        while(curr!=null&&curr!=end){
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

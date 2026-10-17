public class Q86 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
        ListNode curr = head;
        ListNode prev=null;
        ListNode point = null;
        while (curr!=null){
                if(curr.val<x){
                    if(curr==head){
                        point=head;
                        curr=curr.next;
                    }
                    else if(point==null){
                        ListNode next = curr.next;
                        if(prev!=null) {
                            prev.next = next;
                        }
                        curr.next=head;
                        head=curr;
                        point=head;
                        curr=next;
                    }
                    else{
                        ListNode next = curr.next;
                        if(prev!=null) {
                            prev.next = next;
                        }
                        if(point.next!=curr){
                            ListNode next2=point.next;
                            point.next=curr;
                            curr.next=next2;
                            point=curr;
                            curr=next;
                        }
                        else{
                            point=point.next;
                            curr=point;
                        }

                    }
                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
        }
        return head;
    }
}

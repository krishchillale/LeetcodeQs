import java.util.PriorityQueue;

public class Q23 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            while(head!=null){
                pq.add(head.val);
                head=head.next;
            }
        }
        ListNode head = null;
        ListNode curr = null,prev=null;
        while(!pq.isEmpty()){
            if(head==null){
                head = new ListNode(pq.remove());
                prev= head;
            }
            else{
                curr = new ListNode(pq.remove());
                prev.next=curr;
                prev=curr;
            }
        }
        return head;
    }
}

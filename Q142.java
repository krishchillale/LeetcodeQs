import java.util.HashMap;

public class Q142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
        public ListNode detectCycle(ListNode head) {
            HashMap<ListNode,Integer> map = new HashMap<>();
            ListNode curr = head;
            while(curr!=null){
                if(map.containsKey(curr)){
                    return curr;
                }
                map.put(curr,1);
                curr=curr.next;
            }
            return null;
        }
}

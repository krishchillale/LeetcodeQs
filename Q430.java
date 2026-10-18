public class Q430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        Node curr = head;
        while(curr!=null){
            if(curr.child!=null){
                Node child = flatten(curr.child);
                Node next = curr.next;
                Node last = child;
                while (last.next!=null){
                    last=last.next;
                }
                if(next!=null){
                    next.prev=last;
                }
                curr.next=child;
                child.prev=curr;
                last.next=next;
                curr.child=null;
            }
            curr=curr.next;
        }
        return head;
    }
}

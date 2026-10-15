import java.util.HashMap;

public class Q138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node head2 = new Node(head.val);
        Node curr1 = head;
        Node curr2 = head2;
        HashMap<Node,Node> map = new HashMap<>();
        map.put(head,head2);
        while (curr2!=null){
            Node n = curr1.next;
            Node r = curr1.random;
            if(n!=null){
                if(map.containsKey(n)){
                    curr2.next=map.get(n);
                }
                else {
                    Node n2 = new Node(n.val);
                    map.put(n,n2);
                    curr2.next=n2;
                }
            }
            if(r!=null){
                if(map.containsKey(r)){
                    curr2.random=map.get(r);
                }
                else {
                    Node r2 = new Node(r.val);
                    map.put(r,r2);
                    curr2.random=r2;
                }
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return head2;
    }
}

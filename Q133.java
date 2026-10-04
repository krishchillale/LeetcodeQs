import java.util.*;

public class Q133 {
   static  class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        Node p  = new Node(node.val);
        q1.add(node);
        q1.add(null);
        q2.add(p);
        q2.add(null);
        HashMap<Integer,Node> map = new HashMap<>();
        map.put(p.val,p);
        while (!q1.isEmpty()){
            Node curr1 = q1.remove();
            Node curr2 = q2.remove();
            if(curr1==null){
                if(q1.isEmpty()){
                    break;
                }
                q1.add(null);
                q2.add(null);
            }
            else{
                for(int i=0;i<curr1.neighbors.size();i++){
                    Node n1 = curr1.neighbors.get(i);
                    if(map.containsKey(n1.val)){
                        Node n2 = map.get(n1.val);
                        curr2.neighbors.add(n2);
                    }
                    else{
                        Node n2 = new Node(n1.val);
                        curr2.neighbors.add(n2);
                        map.put(n2.val,n2);
                        q1.add(n1);
                        q2.add(n2);
                    }

                }
            }
        }
        return p;
    }
}

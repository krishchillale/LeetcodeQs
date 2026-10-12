import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        while (!q.isEmpty()){
            Node curr = q.remove();

            if(curr == null){
                result.add(temp);
                temp = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else {
                temp.add(curr.val);
                for(int i=0;i<curr.children.size();i++){
                    q.add(curr.children.get(i));
                }
            }
        }
        return result;
    }
}

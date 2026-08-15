
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q2196 {
        public TreeNode createBinaryTree(int[][] descriptions) {
            HashMap<Integer,TreeNode> map = new HashMap<>();
            HashMap<Integer,Integer> rc = new HashMap<>();
            for(int i=0;i<descriptions.length;i++){
                int root = descriptions[i][0];
                int child = descriptions[i][1];
                rc.put(child,1);
                int left = descriptions[i][2];
                TreeNode r;
                TreeNode c;
                if(!rc.containsKey(root)){
                    rc.put(root,0);
                }
                if(map.containsKey(root)){
                     r = map.get(root);
                }
                else{
                     r = new TreeNode(root);
                    map.put(root,r);
                }
                if(map.containsKey(child)){
                     c = map.get(child);
                }
                else{
                     c = new TreeNode(child);
                    map.put(child,c);
                }
                if(left==1){
                    r.left = c;
                }
                else{
                    r.right=c;
                }

            }
            List<Integer> keysWithZeroValue = new ArrayList<>();
            rc.forEach((key, value) -> {
                if (value == 0) {
                    keysWithZeroValue.add(key);
                }
            });
            return map.get(keysWithZeroValue.get(0));
        }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q107 {
    class TreeNode {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                result.addFirst(new ArrayList<>());
                q.add(null);
            }
            else{
                result.get(0).add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
}

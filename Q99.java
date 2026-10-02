import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Q99 {
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
    public void recoverTree(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<TreeNode> res = new ArrayList<>();
        inorder(root,res,pq);
        int count=0;
        for(int i=0;i<res.size();i++){
            int curr = pq.remove();
            if(curr!=res.get(i).val){
                res.get(i).val=curr;
                count++;
            }
            if(count==2){
                return;
            }
        }
    }
    static void inorder(TreeNode root, ArrayList<TreeNode> res, PriorityQueue<Integer> pq){
        if(root==null){
            return;
        }
        inorder(root.left,res,pq);
        res.add(root);
        pq.add(root.val);
        inorder(root.right, res, pq);
    }
}

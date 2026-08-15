import java.util.ArrayList;
import java.util.Arrays;

public class Q230 {
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
        public int kthSmallest(TreeNode root, int k) {
            ArrayList<Integer> res = new ArrayList<>();
            inorder(root,res);
            return res.get(k-1);
        }

        static void inorder(TreeNode root, ArrayList<Integer> res){
            if(root==null){
                return;
            }
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);
        }

}

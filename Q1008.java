import java.util.Arrays;

public class Q1008 {
    public static class TreeNode {
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root=insert(root,preorder[i]);
        }
        return root;
    }
    static TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }
}

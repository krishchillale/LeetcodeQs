public class Q2265 {
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
  static class Node{
        int sum,count,ans;
        public Node(int sum,int count,int ans){
            this.ans=ans;
            this.count=count;
            this.sum=sum;
        }
  }
    public int averageOfSubtree(TreeNode root) {
        Node result = helper(root);
        return result.ans;
    }
    static Node helper(TreeNode root){
        if(root==null){
            return new Node (0,0,0);
        }
        Node left = helper(root.left);
        Node right = helper(root.right);
        Node n = new Node (left.sum+right.sum+root.val,left.count+ right.count+1, left.ans+ right.ans);
        if(n.sum/n.count==root.val){
            n.ans++;
        }
        return n;
    }
}

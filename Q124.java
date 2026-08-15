public class Q124 {
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
    public int maxPathSum(TreeNode root) {
        int [] max = new int [1];
        max[0]=Integer.MIN_VALUE;
        helper(root,max);
        return max[0];
    }
    static int helper(TreeNode root,int [] max){
        int sum;
        max[0]=Math.max(root.val,max[0]);
        sum=root.val;
        if(root.right==null&&root.left==null){
            return root.val;
        }
        int left = Integer.MIN_VALUE,right=Integer.MIN_VALUE;
        if(root.left!=null){
            left=helper(root.left, max);
            sum=Math.max(sum,root.val+left);
            max[0]=Math.max(max[0],left+root.val);
        }
        if(root.right!=null){
            right=helper(root.right,max);
            sum=Math.max(sum,root.val+right);
            max[0]=Math.max(max[0],right+root.val);
        }

        if(root.left!=null&&root.right!=null){
            max[0]=Math.max(max[0],right+root.val+left);
        }
        return sum;
    }
}

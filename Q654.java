public class Q654 {
    static class TreeNode {
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0,nums.length-1,nums);
    }
    static TreeNode helper(int start,int end,int [] nums){
        if(start>end){
            return null;
        }
        if(start<0||end<0||start==nums.length||end==nums.length){
            return null;
        }
        if(start==end){
            return new TreeNode(nums[start]);
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=start;i<=end;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left=helper(start,index-1,nums);
        root.right=helper(index+1,end,nums);
        return root;
    }
}

public class Q108 {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return Create(nums,0,nums.length-1);
    }
    static TreeNode Create(int[] nums,int i,int j){
        if(i>j){
            return null;
        }
        int mid =  i+(j-i)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=Create(nums,i,mid-1);
        root.right=Create(nums,mid+1,j);
        return root;
    }
}

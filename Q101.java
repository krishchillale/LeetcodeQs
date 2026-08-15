

public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        return true;
    }
    static boolean helper(TreeNode r, TreeNode s){
            if(r==null&&s==null){
                return true;
            }
            if(r==null||s==null){
                return false;
            }
            if(r.val!=s.val){
                return false;
            }
            return helper(r.right,s.left)&&helper(r.left,s.right);
    }
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }
}

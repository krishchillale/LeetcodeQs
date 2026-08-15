import java.util.*;

public class Q637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        double sum=0,count=0;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                result.add(sum/count);
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                sum=0;
                count=0;
            }
            else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                sum+=curr.val;
                count++;
            }
        }
        return result;
    }
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
}

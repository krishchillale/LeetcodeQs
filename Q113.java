import java.net.Inet4Address;
import java.util.*;
public class Q113 {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(targetSum<0){
            helper2(root,targetSum,result,temp);
        }
        else {
            helper(root, targetSum, result, temp);
        }
        return result;
    }
    static void helper(TreeNode root, int target, List<List<Integer>> result, List<Integer> temp){
        if(root==null){
            return;
        }
        target-= root.val;
        List<Integer> tp = new ArrayList<>(temp);
        tp.add(root.val );
        if(target<0){
            return;
        }
        if(target==0&&root.left==null&&root.right==null){
            result.add(tp);
            return;
        }
        helper(root.left,target,result,tp);
        helper(root.right,target,result,tp);
    }
    static void helper2(TreeNode root, int target, List<List<Integer>> result, List<Integer> temp){
        if(root==null){
            return;
        }
        target-= root.val;
        List<Integer> tp = new ArrayList<>(temp);
        tp.add(root.val );
        if(target>0){
            return;
        }
        if(target==0&&root.left==null&&root.right==null){
            result.add(tp);
            return;
        }
        helper2(root.left,target,result,tp);
        helper2(root.right,target,result,tp);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        int left=1,right=0;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                result.add(temp);
                temp = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                if(right==1){
                    right=0;
                    left=1;
                }
                else{
                    left=0;
                    right=1;
                }
            }
            else{

                if(right==1){
                    temp.addFirst(curr.val);
                }
                else{
                    temp.add(0,curr.val);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
            }
        }
        return result;
    }
}

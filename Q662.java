import java.util.*;

public class Q662 {
    class Pair{
        TreeNode node;
        long index;
        Pair(TreeNode node, long index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        long first=-1,sec=-1;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        q.add(null);
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(curr==null){
                first=-1;
                sec=-1;
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
                long index= curr.index;
                if(first==-1){
                    first=index;
                }
                sec= index;
                max=Math.max(max,(int)(sec-first+1));
                if(curr.node.left!=null){
                    q.add(new Pair(curr.node.left,2*index+1));
                }
                if(curr.node.right!=null){
                    q.add(new Pair(curr.node.right,2*index+2));
                }
            }
        }
        return max;
    }
    static int height(TreeNode root){
        if(root==null){
            return  0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
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

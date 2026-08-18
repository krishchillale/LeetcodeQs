import java.util.HashMap;
public class Q106 {
    public static  class TreeNode {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int n = postorder.length;
        for(int i=0;i<n;i++){
        map.put(postorder[i],i);
    }
    int [][] arr = new int [n][2];
        for(int i=0;i<n;i++){
        arr[i][0]=inorder[i];
        arr[i][1]=map.get(inorder[i]);
    }
        return helper(arr,0,n-1);
}
static TreeNode helper(int [][]arr,int low,int high){
    if(low>high){
        return null;
    }
    int max=Integer.MIN_VALUE,index=0;
    for(int i=low;i<=high;i++){
        if(max<arr[i][1]){
            max=arr[i][1];
            index=i;
        }
    }
    TreeNode root = new TreeNode(arr[index][0]);
    root.left=helper(arr,low,index-1);
    root.right=helper(arr,index+1,high);
    return root;
}
}

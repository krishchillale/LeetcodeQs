public class Q450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.right==null&&root.left==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode curr = root.right,prev=curr;
            while(curr.left!=null){
                prev=curr;
                curr=curr.left;
            }
            if(prev==curr){
                root.val=curr.val;
                root.right=null;
            }
            else {
                prev.left = curr.right;
                root.val = curr.val;
            }
        }
        return root;
    }
    class TreeNode {
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
}

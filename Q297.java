import java.util.LinkedList;
import java.util.Queue;
public class Q297 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public class Codec {

        public String serialize(TreeNode root) {
            if(root==null){
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                TreeNode curr = q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(null);
                }
                else if(curr.val==1001){
                    sb.append('#');
                    continue;
                }
                else{
                    sb.append(curr.val).append(",");
                    if(curr.left==null){
                      q.add(new TreeNode(1001));
                    }
                    else{
                        q.add(curr.left);
                    }
                    if(curr.right==null){
                        q.add(new TreeNode(1001));
                    }
                    else {
                        q.add(curr.right);
                    }
                }
            }
            return sb.toString();
        }

        public TreeNode deserialize(String data) {
            if(data.isEmpty()){
                return null;
            }
            int i=0;
            StringBuilder sb = new StringBuilder("");
            while(data.charAt(i)!=','){
                sb.append(data.charAt(i));
                i++;
            }
            i++;
            TreeNode root  = new TreeNode(Integer.parseInt(sb.toString()));
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            sb.setLength(0);
            for(i=i;i<data.length();i++){
                TreeNode curr = q.remove();
                if(data.charAt(i)=='#'){
                    sb.setLength(0);
                    curr.left=null;
                }
                else{
                    while (data.charAt(i)!=','){
                        sb.append(data.charAt(i));
                        i++;
                    }
                    TreeNode temp = new TreeNode(Integer.parseInt(sb.toString()));
                    curr.left=temp;
                    q.add(temp);
                    sb.setLength(0);
                }
                i++;
                if(data.charAt(i)=='#'){
                    sb.setLength(0);
                    curr.right=null;
                }
                else{
                    while (data.charAt(i)!=','){
                        sb.append(data.charAt(i));
                        i++;
                    }
                    TreeNode temp = new TreeNode(Integer.parseInt(sb.toString()));
                    curr.right=temp;
                    q.add(temp);
                    sb.setLength(0);
                }
            }
            return root;
        }
    }
}

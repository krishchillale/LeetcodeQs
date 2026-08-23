import java.util.ArrayList;
import java.util.List;

public class Q140 {
    class Node{
        boolean eow=false;
        Node [] arr = new Node[26];
        public Node(){
            for(int i=0;i<26;i++){
                arr[i]=null;
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        Node root = new Node();
        for(int i=0;i<wordDict.size();i++){
            Node curr = root;
            String s1 = wordDict.get(i);
            for(int j=0;j<s1.length();j++){
                if(curr.arr[s1.charAt(j)-'a']==null){
                    curr.arr[s1.charAt(j)-'a']=new Node();
                }
                curr=curr.arr[s1.charAt(j)-'a'];
            }
            curr.eow=true;
        }
        List<String> list = new ArrayList<>();
        helper(root,s,"",list);
        return list;
    }
    static void helper(Node root,String s,String s1,List<String> list){
        Node curr = root;
        if(s.isEmpty()){
            list.add(s1);
        }
        for(int i=0;i<s.length();i++){
            if(curr.arr[s.charAt(i)-'a']==null){
                return;
            }
            curr=curr.arr[s.charAt(i)-'a'];
            if(curr.eow){
                StringBuilder temp = new StringBuilder(s1);
                if(!temp.isEmpty()){
                    temp.append(" ");
                }
                temp.append(s.substring(0,i+1));
                helper(root,s.substring(i+1),temp.toString(),list);
            }
        }
    }
}

public class Q208 {
    class WordDictionary {
        class Node{
            Node [] arr = new Node[26];
            boolean eow=false;
            public Node(){
                for(int i=0;i<26;i++){
                    arr[i]=null;
                }
            }
        }
        Node root;
        public WordDictionary() {
            root=new Node();
        }

        public void addWord(String word) {
            Node curr = root;
            for(int i=0;i<word.length();i++){
                if(curr.arr[word.charAt(i)-'a']==null){
                    curr.arr[word.charAt(i)-'a']=new Node();
                }
                curr=curr.arr[word.charAt(i)-'a'];
            }
            curr.eow=true;
        }
        public boolean search(String word) {
            Node curr = root;
            for(int i=0;i<word.length();i++){
                if(curr.arr[word.charAt(i)-'a']==null){
                    return false;
                }
                curr=curr.arr[word.charAt(i)-'a'];
            }
            if(curr.eow){
                return true;
            }
            return false;
        }

    }
}

import java.util.Stack;

public class Q1190 {
    static class Info{
        int end;
        String ans;

        public Info(int end,String ans){
            this.ans=ans;
            this.end=end;
        }
    }
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                Info temp = rev(s,i+1);
                sb.append(temp.ans);
                 i = temp.end;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    static Info rev(String s,int i){
        StringBuilder sb = new StringBuilder("");
        while(s.charAt(i)!=')'){
            if(s.charAt(i)=='('){
                Info temp = rev(s,i+1);
                sb.append(temp.ans);
                i = temp.end;
            }
            else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return new Info(i,sb.reverse().toString());
    }
}

import java.util.Stack;

public class Q856 {
    public int scoreOfParentheses(String s) {
        Stack<Character> s1 = new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            int k = i;
            s1.push(s.charAt(i++));
            while (!s1.isEmpty()){
                if(s.charAt(i)=='('){
                    s1.push('(');
                }
                else{
                    s1.pop();
                }
                i++;
            }
            i--;
            ans+=helper(s,k,i);
        }
        return ans;
    }
    static int helper(String s, int start,int end){
        if(end-start==1){
            return 1;
        }
        Stack<Character> s1 = new Stack<>();
        int ans=0;
        for(int i=start+1;i<end;i++){
            int k = i;
            s1.push(s.charAt(i++));
            while (!s1.isEmpty()){
                if(s.charAt(i)=='('){
                    s1.push('(');
                }
                else{
                    s1.pop();
                }
                i++;
            }
            i--;
            ans+=helper(s,k,i);
        }
        return ans*2;
    }
}

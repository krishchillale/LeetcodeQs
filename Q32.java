import java.util.Stack;

public class Q32 {
    public int longestValidParentheses(String s) {
        int count=0,max=0;
        int n = s.length();
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                s1.push(i);
                count++;
            }
            else if(s.charAt(i)==')'&&s1.isEmpty()){
                max=Math.max(count,max);
                count=0;
            }
            else{
                count++;
                s1.pop();
                if(s1.isEmpty()){
                    max=Math.max(max,count);
                }
                else{
                    max=Math.max(max,i-s1.peek());
                }
            }
        }
        if(!s1.isEmpty()){
            count=n-1-s1.pop();
        }
        max=Math.max(max,count);
        return max;
    }
}

import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty()){
                if(s.charAt(i)==')'&&stack.peek()!='('){
                    return false;
                }
                if(s.charAt(i)=='}'&&stack.peek()!='{'){
                    return false;
                }
                if(s.charAt(i)==']'&&stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}

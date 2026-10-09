import java.util.Stack;

public class Q1541 {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    count++;
                    if(i<s.length()-1&&s.charAt(i+1)==')'){
                        i++;
                    }
                    else{
                        count++;
                    }
                }
                else{
                    if(i<s.length()-1&&s.charAt(i+1)==')'){
                        i++;
                    }
                    else{
                        count++;
                    }
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
            count+=2;
        }
        return count;
    }
}

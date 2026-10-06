import java.util.Stack;

public class Q921 {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                s1.push('(');
            }
            else{
                if(s1.isEmpty()){
                    count++;
                }
                else{
                    s1.pop();
                }
            }
        }
        while (!s1.isEmpty()){
            s1.pop();
            count++;
        }
        return count;
    }
}

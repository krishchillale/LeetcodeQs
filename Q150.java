import java.util.Stack;

public class Q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i< tokens.length;i++){
            if(tokens[i].charAt(0)=='+'){
                int t1=s.pop();
                int t2=s.pop();
                s.push(t1+t2);
            }
            else if(tokens[i].equals("-")){
                int t1=s.pop();
                int t2=s.pop();
                s.push(t2-t1);
            }
            else if(tokens[i].charAt(0)=='*'){
                int t1=s.pop();
                int t2=s.pop();
                s.push(t2*t1);
            }
            else if(tokens[i].charAt(0)=='/'){
                int t1=s.pop();
                int t2=s.pop();
                s.push(t2/t1);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}

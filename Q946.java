import java.util.Stack;

public class Q946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s= new Stack<>();
        int n = pushed.length;
        s.push(pushed[0]);
        int j=1;
        for(int i=0;i<n;i++){
            int target = popped[i];
            while((s.isEmpty())||(j<n&&s.peek()!=target)){
                s.push(pushed[j++]);
            }
            if(s.peek()!=target){
                return false;
            }
            s.pop();
        }
        return true;
    }
}

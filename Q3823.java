import java.util.Queue;
import java.util.Stack;

public class Q3823 {
    public String reverseByType(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>=97&&c<=122){
                s1.push(c);
            }
            else{
                s2.push(c);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>=97&&c<=122){
                sb.append(s1.pop());
            }
            else{
                sb.append(s2.pop());
            }
        }
        return sb.toString();
    }
}

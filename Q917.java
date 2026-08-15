import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q917 {
    public String reverseOnlyLetters(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                s1.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                sb.append(s1.pop());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

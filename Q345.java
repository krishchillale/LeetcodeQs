import java.util.Stack;

public class Q345 {
    public String reverseVowels(String s) {
        Stack<Character> s1 = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                s1.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.append(s1.pop());
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

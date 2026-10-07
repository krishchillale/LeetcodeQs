import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Q301 {
    public List<String> removeInvalidParentheses(String s) {
            int up =0,down = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    down++;
                }
                else{
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()){
            up++;
            stack.pop();
        }
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        helper(result,0,up,down,s,"",new Stack<>(),map);
        return result;
    }
    static void helper(List<String> result, int i, int up, int down, String s, String temp, Stack<Character> stack, HashMap<String,Integer> map){
        if(i==s.length()&&up==0&&down==0){
            if(stack.isEmpty()){
                if(!map.containsKey(temp)) {
                    result.add(temp);
                    map.put(temp,1);
                }
            }
            return;
        }
        if(i==s.length()){
            return;
        }
        if(s.charAt(i)=='('){
            stack.push('(');
            helper(result, i+1, up, down, s, temp+'(',stack,map);
            stack.pop();
            if(up>0) {
                helper(result, i + 1, up - 1, down, s, temp, stack,map);
            }
        }
        else if(s.charAt(i)==')'){
            if(down>0){
                helper(result,i+1,up,down-1,s,temp,stack,map);
            }
            if(!stack.isEmpty()){
                stack.pop();
                helper(result, i+1, up, down, s, temp+')', stack,map);
                stack.push('(');
            }
        }
        else{
            helper(result, i+1, up, down, s, temp+s.charAt(i), stack,map);
        }
    }
}

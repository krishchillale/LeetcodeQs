import java.util.Stack;

public class Q1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int [] ans = new int [n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                if(s.isEmpty()){
                    s.push(0);
                    ans[i]=0;
                }
                else{
                    if(s.peek()==0){
                        s.push(1);
                        ans[i]=1;
                    }
                    else{
                        s.push(0);
                        ans[i]=0;
                    }
                }
            }
            else{
                ans[i]=s.pop();
            }
        }
        return ans;
    }
}

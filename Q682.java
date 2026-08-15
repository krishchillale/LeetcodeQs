import java.util.Stack;

public class Q682 {
    public int calPoints(String[] op) {
        int n = op.length;
        int sum=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(op[i].charAt(0)=='+'){
                int t1=s.pop(),t2=s.pop();
                sum+=t1+t2;
                s.push(t2);
                s.push(t1);
                s.push(t2+t1);
            }
            else if(op[i].charAt(0)=='D'){
                s.push(2*s.peek());
                sum+=s.peek();
            }
            else if(op[i].charAt(0)=='C'){
                sum-=s.pop();
            }
            else{
                s.push(Integer.parseInt(op[i]));
                sum+=s.peek();
            }
        }
        return sum;
    }
}

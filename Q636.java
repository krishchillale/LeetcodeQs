import java.util.List;
import java.util.Stack;

public class Q636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        int end=-1;
        for(int i=0;i<logs.size();i++){
            String lo = logs.get(i);
            int idx=-1;
            int start=-1;
            int time = -1;
            int j=0;
            while (lo.charAt(j)!=':'){
                j++;
            }
            idx = Integer.parseInt(lo.substring(0,j));
            j++;
            if(lo.charAt(j)=='s'){
                start=1;
                j+=6;
            }
            else{
                start=0;
                j+=4;
            }
            time = Integer.parseInt(lo.substring(j));
            if(start==1){
                if(stack.isEmpty()){
                    stack.push(idx);
                    end = time-1;
                }
                else{
                    int o = stack.peek();
                    ans[o]+=time-1-end;
                    end = time-1;
                    stack.push(idx);
                }
            }
            else{
                ans[idx] += time-end;
                end = time;
                stack.pop();
            }
        }
        return ans;
    }
}

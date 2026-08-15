import java.util.LinkedList;
import java.util.Queue;

public class Q2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(tickets[i]);
            if(i==k){
                q.add(null);
            }
        }
        int time=0;
        while(!q.isEmpty()){
            if(q.peek()==null){
                q.remove();
                q.add(null);
            }
            time++;
            int top = q.remove()-1;
            if(top==0){
                if(q.peek()==null){
                    return time;
                }
            }
            else{
                q.add(top);
            }
        }
        return 0;
    }
}

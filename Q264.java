import java.util.HashMap;
import java.util.PriorityQueue;

public class Q264 {
    public int nthUglyNumber(int n) {
        int count=1;
        if(n==1){
            return 1;
        }
        PriorityQueue<Long> pq1 = new PriorityQueue<>();
        PriorityQueue<Long> pq2 = new PriorityQueue<>();
        PriorityQueue<Long> pq3 = new PriorityQueue<>();
        HashMap<Long,Integer> map = new HashMap<>();
        pq1.add(2L);
        pq2.add(3L);
        pq3.add(5L);
        while(count<n){
            long curr=0;
            if(pq1.peek()<pq2.peek()&&pq1.peek()<pq3.peek()){
                curr = pq1.remove();
                if(curr*2>0&&!map.containsKey(curr*2)){
                    pq1.add(curr*2);
                    map.put(curr*2,1);
                }
                if(curr*3>0&&!map.containsKey(curr*3)){
                    pq2.add(curr*3);
                    map.put(curr*3,1);
                }
                if(curr*5>0&&!map.containsKey(curr*5)){
                    pq3.add(curr*5);
                    map.put(curr*5,1);
                }
            }
            else if(pq2.peek()<pq1.peek()&&pq2.peek()<pq3.peek()){
                curr = pq2.remove();
                if(curr*2>0&&!map.containsKey(curr*2)){
                    pq1.add(curr*2);
                    map.put(curr*2,1);
                }
                if(curr*3>0&&!map.containsKey(curr*3)){
                    pq2.add(curr*3);
                    map.put(curr*3,1);
                }
                if(curr*5>0&&!map.containsKey(curr*5)){
                    pq3.add(curr*5);
                    map.put(curr*5,1);
                }
            }
            else{
                curr = pq3.remove();
                if(curr*2>0&&!map.containsKey(curr*2)){
                    pq1.add(curr*2);
                    map.put(curr*2,1);
                }
                if(curr*3>0&&!map.containsKey(curr*3)){
                    pq2.add(curr*3);
                    map.put(curr*3,1);
                }
                if(curr*5>0&&!map.containsKey(curr*5)){
                    pq3.add(curr*5);
                    map.put(curr*5,1);
                }
            }
            count++;
            if(count==n){
                return (int)curr;
            }
        }
        return 0;
    }
}

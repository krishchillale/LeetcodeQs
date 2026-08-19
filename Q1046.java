import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int s1 = pq.remove();
            int s2 = pq.remove();
            if(s1>s2){
                pq.add(s1-s2);
            }
        }
        if(pq.size()==1){
            return pq.peek();
        }
        return 0;
    }
}

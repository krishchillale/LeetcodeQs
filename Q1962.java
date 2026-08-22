import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1962 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i< piles.length;i++){
            pq.add(piles[i]);
        }
        int count=0;
        while(count<k&&!pq.isEmpty()){
            int max = pq.remove();

            if(max%2!=0){
                max++;
            }
            max/=2;
            if(max!=0){
                pq.add(max);
            }
            count++;
        }
        count=0;
        while(!pq.isEmpty()){
            count+=pq.remove();
        }
        return count;
    }
}

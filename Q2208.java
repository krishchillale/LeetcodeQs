import java.util.Comparator;
import java.util.PriorityQueue;

public class Q2208 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum=0;
        for(int i=0;i<nums.length;i++){
            pq.add((double)nums[i]);
            sum+=(double)nums[i];
        }
        double curr=sum;
        int count=0;
        while(!pq.isEmpty()&&sum/2<curr){
            double x = pq.remove();
            curr-=x/2;
            pq.add(x/2);
            count++;
        }
        return count;
    }
}

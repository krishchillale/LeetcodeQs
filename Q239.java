import java.util.Comparator;
import java.util.PriorityQueue;

public class Q239 {
    static class Num implements Comparable<Num> {
        int idx;
        int val;
        public Num(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Num other) {
            if(this.val==other.val){
                return this.idx-other.idx;
            }
            return other.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] result = new int [n-k+1];
        PriorityQueue<Num> pq = new PriorityQueue();
        for(int i=0;i<k-1;i++){
            Num n1 = new Num(nums[i],i);
            pq.add(n1);
        }
        int z=0;
        for(int i=k-1;i<n;i++){
            pq.add(new Num(nums[i],i));
            while(pq.peek().idx<i-k){
                pq.remove();
            }
            result[z++]=pq.peek().val;
        }
    return result;
    }
}

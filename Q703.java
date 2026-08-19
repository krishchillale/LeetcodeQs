import java.util.PriorityQueue;

public class Q703 {
    class KthLargest {
        int j;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        public KthLargest(int k, int[] nums) {
            int i=0;
            int n = nums.length;
            for(i=0;i<n&&i<k;i++){
                pq.add(nums[i]);
            }
            for(i=i;i<n;i++){
                pq.add(nums[i]);
                if(pq.size()>k){
                    pq.remove();
                }
            }
            j=k;
        }

        public int add(int val) {
            if(pq.size()==j){
                pq.add(val);
                pq.remove();
            }
            else{
                pq.add(val);
            }
            return pq.peek();
        }
    }
}

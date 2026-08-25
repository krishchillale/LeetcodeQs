import java.util.PriorityQueue;

public class Q3718 {
    public int missingMultiple(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                pq.add(nums[i]);
            }
        }
        int i=k;
        int prev=-1;
        while(!pq.isEmpty()){
            if(prev==pq.peek()){
                pq.remove();
                continue;
            }
            if(pq.peek()!=i){
                return i;
            }
            prev=pq.remove();
            i+=k;
        }
        return i;
    }
}

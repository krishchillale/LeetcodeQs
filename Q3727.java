import java.util.Comparator;
import java.util.PriorityQueue;

public class Q3727 {
    class Square implements Comparable<Square> {
        int x;
        public Square(int x){
            this.x=x;
        }
        @Override
        public int compareTo(Square other){
            return (int)(Math.pow(other.x,2)-Math.pow(this.x,2));
        }
    }
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        PriorityQueue<Square> pq1 = new PriorityQueue<>();
        PriorityQueue<Square> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0;i<nums.length;i++){
            pq1.add(new Square(nums[i]));
            pq2.add(new Square(nums[i]));
        }
        int i=0;
        while (i< nums.length){
            if(i%2==0){
                ans+=(long) Math.pow(pq1.remove().x,2);
            }
            else{
                ans-=(long) Math.pow(pq2.remove().x,2);
            }
            i++;
        }
        return ans;
    }
}

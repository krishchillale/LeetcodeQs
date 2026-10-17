import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q3551 {
    class Pair implements Comparable<Pair>{
        int num;
        int index;
        public Pair(int num,int index){
            this.num=num;
            this.index=index;
        }
        @Override
        public int compareTo(Pair other){
            int sum1=0,sum2=0;
            int temp1=this.num,temp2= other.num;
            while (temp1>0){
                sum1+=temp1%10;
                temp1/=10;
            }
            while (temp2>0){
                sum2+=temp2%10;
                temp2/=10;
            }
            if(sum1==sum2){
                return this.num- other.num;
            }
            return sum1-sum2;
        }
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(new Pair(nums[i],i));
        }
        int [] index = new int [n];
        for(int i=0;i<n;i++){
            Pair curr = pq.remove();
            index[curr.index]=i;
        }
        boolean [] vis = new boolean[n];
        int swap=0;
        for(int i=0;i<n;i++){
            int curr = i;
            int count=0;
            while (!vis[curr]){
                vis[curr]=true;
                count++;
                curr=index[curr];
            }
            if(count>0) {
                swap += count - 1;
            }
        }
        return swap;
    }
}

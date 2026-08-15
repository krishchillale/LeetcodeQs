import java.util.Set;
import java.util.TreeSet;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int prev=Integer.MIN_VALUE;
        int count=1;
        int max=1;
        for (Integer num : set) {
            if(prev==Integer.MIN_VALUE){
                prev=num;
                continue;
            }
            if(prev+1==num){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
            prev=num;
        }
        return max;
    }
}

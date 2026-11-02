import java.util.Arrays;

public class Q462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n/2];
        int count=0;
        for(int i=0;i<n;i++){
            count+=Math.abs(mid-nums[i]);
        }
        return count;
    }
}

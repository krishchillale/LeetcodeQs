public class Q3736 {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            count+=max-nums[i];
        }
        return count;
    }
}

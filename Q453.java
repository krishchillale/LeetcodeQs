public class Q453 {
    public int minMoves(int[] nums) {
        int count=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(nums[i],min);
        }
        for(int i=0;i<nums.length;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}

public class Q3689 {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return (long) (k*(max-min));
    }
}

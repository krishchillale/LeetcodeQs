public class Q3903 {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] arr = new int [n];
        int min = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            arr[i]=min;
        }
        int stable = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max =Math.max(max,nums[i]);
            if(max-arr[i]<=k){
                stable=Math.min(stable,i);
            }
        }
        if(stable==Integer.MAX_VALUE){
            return -1;
        }
        return stable;
    }
}

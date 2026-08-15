public class Q2574 {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum1=0;
        int sum2=0;
        int [] left = new int [n];
        int [] right = new int [n];
        for(int i=0;i<n;i++){
            left[i]=sum1;
            right[n-1-i]=sum2;
            sum1+=nums[i];
            sum2+=nums[n-1-i];
        }
        int [] result = new int [n];
        for(int i=0;i<n;i++){
            result[i]=Math.abs(left[i]-right[i]);
        }
        return result;
    }
}

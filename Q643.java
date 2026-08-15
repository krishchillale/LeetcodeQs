public class Q643 {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int [] arr = new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        double max=(double) (arr[k-1]-arr[0]+nums[0])/(double) (k);
        for(int i=1;i<=n-k;i++){
            double avg = (double) (arr[i+k-1]-arr[i]+nums[i])/(double)k;
            max=Math.max(max,avg);
        }
        return max;
    }
}

public class Q2475 {

    public int unequalTriplets(int[] nums) {
        int [] hash = new int [1001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        int count=0,k=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    continue;
                }
                count+=k-hash[i]-hash[j];
            }
            k-=hash[nums[i]];
        }
        return count;
    }
}

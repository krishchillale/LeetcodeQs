public class Q3737 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int tc=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    tc++;
                }
                if(tc>(j-i+1)/2){
                    count++;
                }
            }
        }
        return count;
    }
}

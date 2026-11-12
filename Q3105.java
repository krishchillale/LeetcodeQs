public class Q3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int count=1;
            boolean inc;
            if(nums[i]>nums[i+1]){
                inc=false;
            }
            else if(nums[i]<nums[i+1]){
                inc=true;
            }
            else{
                continue;
            }
            int prev = nums[i];
            int j = i+1;
            if(inc){
                while (j<n&&nums[j]>prev){
                    prev=nums[j++];
                    count++;
                }
            }
            else{
                while (j<n&&nums[j]<prev){
                    prev=nums[j++];
                    count++;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}

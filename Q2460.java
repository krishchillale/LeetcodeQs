public class Q2460 {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
                i++;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int j = i;
                while(j<n&&nums[j]==0){
                    j++;
                }
                if(j==n){
                    break;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
        return nums;
    }
}

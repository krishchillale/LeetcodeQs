public class Q2529 {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int k = 0;
        int z=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                k++;
            }
            else if(nums[i]==0){
                z++;
            }
            else{
                break;
            }
        }
        return Math.max(k,n-(z  +k));
    }
}

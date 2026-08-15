public class Q3702 {
    public int longestSubsequence(int[] nums) {
        int xor = nums[0];
        int n = nums.length;
        boolean flag = true;
        if(nums[0]!=0){
            flag=false;
        }
        for(int i=1;i<n;i++){
            if(nums[i]!=0){
                flag=false;
            }
            xor=xor^nums[i];
        }
        if(flag){
            return 0;
        }
        if(xor==0){
            return n-1;
        }
        return n;
    }
}

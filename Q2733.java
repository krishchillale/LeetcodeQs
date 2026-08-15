import java.util.Arrays;

public class Q2733 {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        if(nums.length<3){
            return -1;
        }

        int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=min&&nums[i]!=max){
                return nums[i];
            }
        }
        return -1;
    }
}

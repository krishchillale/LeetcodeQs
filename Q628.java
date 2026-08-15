import java.util.Arrays;

public class Q628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[n-1]<=0||nums[0]>=0){
            return nums[n-1]*nums[n-2]*nums[n-3];
        }
        int product = nums[n-1]*nums[n-2]*nums[n-3];
        product=Math.max(product,nums[0]*nums[1]*nums[n-1]);
        return product;
    }
}

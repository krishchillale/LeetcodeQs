import java.util.Arrays;

public class Q31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int right = n-1,left=0;
        int flag=0;
        int l=0;
        for(int i=n-1;i>=l;i--){
            for(int j=i-1;j>=l;j--){

                if(nums[i]>nums[j]){
                    left = j;
                    l = left+1;
                    right =i;
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            Arrays.sort(nums);
            return;
        }
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        Arrays.sort(nums,l,n);
    }
}

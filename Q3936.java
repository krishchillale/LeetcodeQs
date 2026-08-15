public class Q3936 {
    public int minimumSwaps(int[] nums) {
        int swap=0;
        int n = nums.length;
        int i=0,j=n-1;
        while(i<j){
            if(nums[i]==0){
                while(i<j&&nums[j]==0){
                    j--;
                }
                if(i==j){
                    break;
                }
                nums[i]=nums[j];
                nums[j--]=0;
                swap++;
            }
            i++;
        }
        return swap;
    }
}


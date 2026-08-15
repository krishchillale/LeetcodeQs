public class Q486 {
    public static void main(String[] args) {
        int [] nums= {1,5,2};
        System.out.println(PredictWinner(nums));
    }
    public static boolean PredictWinner(int [] nums){
        return helper(nums,0, nums.length-1,0,0 );
    }
    static boolean helper(int [] nums,int i,int j,int sum1,int sum2){
        if(i>j){
            if(sum1>=sum2){
                return true;
            }
            return false;
        }
        if(i==j){
            sum1+=nums[i];
            if(sum1>=sum2){
                return true;
            }
            return false;
        }
        boolean right1=false,right2=false,left1=false,left2=false;
        // #### If Picked From Right And Player 2 too picked from right
        right1=helper(nums,i,j-2,sum1+nums[j],sum2+nums[j-1]);
        // #### If Picked From Right And Player 2 too picked from left
        right2=helper(nums,i+1,j-1,sum1+nums[j],sum2+nums[i]);
        // if Picked From Left and Player 2 too picked from left
        left1=helper(nums,i+2,j,sum1+=nums[i],sum2+=nums[i+1]);
        // if picked from Left And Player 2 too picked from right
        left2=helper(nums,i+1,j-1,sum1+=nums[i],sum2+=nums[j]);
        return right1||right2||left1||left2;
    }
}

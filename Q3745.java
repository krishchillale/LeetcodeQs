public class Q3745 {
    public int maximizeExpressionOfThree(int[] nums) {
        int first = -101,sec=-101,min=101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                sec=first;
                first=nums[i];
            }
            else if(nums[i]>sec){
                sec=nums[i];
            }
            min=Math.min(min,nums[i]);
        }
        return first+sec-min;
    }
}

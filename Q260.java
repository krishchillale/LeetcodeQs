public class Q260 {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        int num1=0,num2=0;
        for(int i=0;i<32;i++){
            if(get(ans,i)==1){
                for(int j=0;j<n;j++){
                    if(get(nums[j],i)==1){
                        num1=num1^nums[j];
                    }
                    else{
                        num2=num2^nums[j];
                    }
                }
                int [] result = new int [2];
                result[0]=num1;
                result[1]=num2;
                return result;
            }
        }
        return new int []{};
    }
    public static int get(int number, int i) {
        // Shift the target bit to the 0th position and isolate it
        return (number >>> (31 - i)) & 1;
    }
}

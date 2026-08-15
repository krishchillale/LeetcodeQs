public class Q3925 {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int [] result = new int [2*n];
        int k=0,j=2*n-1;
        for(int i=0;i<n;i++){
            result[j--]=result[k++]=nums[i];

        }
        return result;
    }
}

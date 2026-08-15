import java.util.Arrays;

public class Q532 {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        Arrays.sort(nums);
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(i<n&&prev==nums[i]){
                i++;
            }
            if(i==n){
                break;
            }
            if(BS(nums,i+1,nums[i]+k)){
                count++;
            }
            prev=nums[i];
        }
        return count;
    }
    static boolean BS(int [] nums,int i,int target){
        int j = nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>target){
                j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

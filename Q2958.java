import java.util.HashMap;

public class Q2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int i=0,j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while(j<n){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
            }
            else{
                map.put(nums[j],map.get(nums[j])+1);
            }
            if(map.get(nums[j])>k){
                while(nums[i]!=nums[j]){
                    map.put(nums[i],map.get(nums[i++])-1);
                }
                map.put(nums[i],map.get(nums[i++])-1);
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}

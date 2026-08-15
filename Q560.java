import java.util.HashMap;
public class Q560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0,1); // Should be present cuzz What if THe Sum and the K is Equal for that this will Handle the case
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}

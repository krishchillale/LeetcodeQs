import java.util.HashMap;

public class Q974 {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem = (sum%k+k)%k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return count    ;
    }
}

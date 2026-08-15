import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n  = nums.length;
        Arrays.sort(nums);
        HashMap<List<Integer>,Integer> hash = new HashMap<>();
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int o=k+1;o<n;o++){
                        if((long)nums[i]+nums[j]+nums[k]+nums[o]==(long) target){
                            List<Integer> sub = new ArrayList<>();
                            sub.add(nums[i]);
                            sub.add(nums[j]);
                            sub.add(nums[k]);
                            sub.add(nums[o]);
                            if(!hash.containsKey(sub)){
                                result.add(sub);
                                hash.put(sub,1);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}

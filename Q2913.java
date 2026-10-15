import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class Q2913 {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            int distinct=0;
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                int num = nums.get(j);
                if(!set.contains(num)){
                 distinct++;
                 set.add(num);
                }
                ans+=distinct*distinct;
            }
        }
        return ans;
    }
}

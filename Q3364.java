import java.util.List;
public class Q3364
{
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        int n = nums.size();
        for(int i=0;i<=n-l;i++){
            int sum=0;
            int j = i;
            while (j-i+1<=l){
                sum+=nums.get(j++);
            }
            if(sum>0){
                min=Math.min(min,sum);
            }
            while (j<n&&j-i+1<=r){
                sum+=nums.get(j++);
                if(sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}

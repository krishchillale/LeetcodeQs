import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int count=0,less=0;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                less++;
            }
            else if(nums[i]==target){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(less+i);
        }
        return list;
    }
}

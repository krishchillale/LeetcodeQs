import java.util.ArrayList;
import java.util.List;

public class Q3069 {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        int n = nums.length;
        for(int i=2;i<n;i++){
            if(l1.getLast()>l2.getLast()){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i] );
            }
        }
        int k=0;
        for(int i=0;i<l1.size();i++){
            nums[k++]=l1.get(i);
        }
        for(int i=0;i<l2.size();i++){
            nums[k++]=l2.get(i);
        }
        return nums;
    }
}

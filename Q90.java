import java.util.ArrayList;
import java.util.List;

public class Q90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,0,res,temp);
        return res;
    }
    static void helper(int [] nums,int i,List<List<Integer>> res,List<Integer> temp){
        if(i==nums.length){
            for(int j=0;j<res.size();j++){
                if(res.get(j).equals(temp)){
                    return;
                }
            }
            res.add(temp);
            return;
        }

        List<Integer> t1 = new ArrayList<>(temp);
        helper(nums,i+1,res,temp);
            t1.add(nums[i]);
        helper(nums, i+1, res, t1);
    }
}

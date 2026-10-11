import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> P = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            P.add(nums[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),P);
        return res;
    }
    static void helper(List<List<Integer>> result ,List<Integer> P,List<Integer> UP){
        if(UP.isEmpty()){
            List<Integer> NP = new ArrayList<>(P);
            result.add(NP);
            return;
        }
        int prev = -101;
        List<Integer> NP = new ArrayList<>(P);
        List<Integer> NUP = new ArrayList<>(UP);
        for(int i=0;i<UP.size();i++){
            if(UP.get(i)!=prev){
                NP.add(UP.get(i));
                NUP.remove(i);
                helper(result,NP,NUP);
                NP.remove(NP.size()-1);
                NUP.add(i,UP.get(i));
            }
            prev=UP.get(i);
        }
    }
}

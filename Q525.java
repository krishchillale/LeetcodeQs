import java.util.HashMap;

public class Q525 {
    public int findMaxLength(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            count = (nums[i]==1) ? count+1 : count-1;
            if(count==0){
                max=i+1;
            }
            else if(!map.containsKey(count)){
                map.put(count,i);
            }
            else{
                max = Math.max(max,i-map.get(count));
            }
        }
        return max;
    }
}

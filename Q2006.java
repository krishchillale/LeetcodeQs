import java.util.HashMap;

public class Q2006 {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int count=0;
        for(int key : map.keySet()){
            if(map.containsKey(key-k)){
                count+=map.get(key)*map.get(key-k);
            }
            if(map.containsKey(key+k)){
                count+=map.get(key)*map.get(key+k);
            }
        }
        return count/2;
    }
}

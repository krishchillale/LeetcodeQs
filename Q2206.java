import java.util.HashMap;

public class Q2206 {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)%2!=0){
                return false;
            }
        }
        return true;
    }
}

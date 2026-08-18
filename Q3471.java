import java.util.Arrays;
import java.util.HashMap;

public class Q3471 {
    public int largestInteger(int[] nums, int k) {
        int max=-1;
        int n = nums.length;
        if(k==1){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }

            for(int key : map.keySet()){
                if(map.get(key)==1){
                    max = Math.max(max,key);
                }
            }
        }
        else if(k==n){
            for(int i=0;i<n;i++){
                max=Math.max(max,nums[i]);
            }
        }
        else{
            int first=nums[0],sec=nums[n-1];
            if(first==sec){
                return -1;
            }
            for(int i=1;i<n-1;i++){
                if(nums[i]==first){
                    first=-1;
                }
                else if(nums[i]==sec){
                    sec=-1;
                }
            }
            if(first!=-1&&sec!=-1){
                max=Math.max(first,sec);
            }
            else if(first!=-1){
                max=first;
            }
            else if(sec!=-1){
                max=sec;
            }
        }
        return max;
    }
}

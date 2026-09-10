import java.util.HashMap;

public class Q2442 {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                count++;
                map.put(nums[i],1);
            }
            int temp=nums[i];
            int rev=0;
            while(temp>0){
                rev = rev*10 +temp%10;
                temp/=10;
            }
            if(!map.containsKey(rev)){
                count++;
                map.put(rev,1);
            }
        }
        return count;
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class Q1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int n = nums.length;
        int i=0,j=0;
        int first = -1,last=-1;
        while(j<n&&count<k){
            if(nums[j]%2==1){
                count++;
                if(first==-1){
                    first=j;
                }
                last = j;
            }
            if(count==k){
                break;
            }
            j++;
        }
        if(count!=k){
            return 0;
        }
        while(j<n-1&&nums[j+1]%2==0){
            j++;
        }
        int ans = (first-i+1)*(j-last+1);

        while(true){
            i=first+1;
            first++;
            while(first<n&&nums[first]%2==0){
                first++;
            }
            last++;
            while(last<n&&nums[last]%2==0){
                last++;
            }
            if(last>=n){
                break;
            }
            j=last;
            while(j<n-1&&nums[j+1]%2==0){
                j++;
            }
            ans += (first-i+1)*(j-last+1);
        }
        return ans;
    }
}

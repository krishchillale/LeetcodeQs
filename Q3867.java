import java.lang.reflect.Array;
import java.util.Arrays;

public class Q3867 {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcd(max,nums[i]);
        }
        Arrays.sort(arr);
        int i=0,j=n-1;
        long sum=0;
        while(i<j){
            sum+=gcd(arr[j--],arr[i++]);
        }
        return sum;
    }
     static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

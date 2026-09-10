import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int j = binary(arr, x);
        int i = j-1;
        int count=0;
        while(i>=0&&j<n&&count<k){
            int f1 = Math.abs(arr[i]-x);
            int f2 = Math.abs(arr[j]-x);
            if(f2<f1){
                result.add(arr[j++]);
            }
            else{
                result.add(arr[i--]);
            }
            count++;
        }
        while(i>=0&&count<k){
            result.add(arr[i--]);
            count++;
        }
        while(j<n&&count<k){
            result.add(arr[j++]);
            count++;
        }
        Collections.sort(result);
        return result;
    }
    static int binary(int [] arr, int x){
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]>x){
                j = mid-1;
            }
            else if(arr[mid]<x){
                i=mid+1;
            }
            else{
                return mid;
            }
        }
        return i;
    }
}

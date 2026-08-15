import java.util.Arrays;
import java.util.HashMap;

public class Q1331 {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int [] temp = new int [n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int [n];
        int rank=1;
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}

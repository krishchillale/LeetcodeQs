import java.util.Arrays;

public class Q978 {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int [][] arr = new int [n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=points[i][0];
            arr[i][1]=points[i][1];
            arr[i][2]= (int)(Math.abs(Math.pow(arr[i][0],2))+Math.abs(Math.pow(arr[i][1],2)));
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[2], b[2]));
        int [][] result = new int [k][2];
        for(int i=0;i<k;i++){
            result[i][0]=arr[i][0];
            result[i][1]=arr[i][1];
        }
        return result;
    }
}

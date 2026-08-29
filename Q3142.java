import java.util.Arrays;

public class Q3142 {
    public boolean satisfiesConditions(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<m-1;i++){
            if(grid[0][i]==grid[0][i+1]){
                return false;
            }
        }
        for(int i=1;i<n;i++){
            if(!Arrays.equals(grid[0],grid[i])){
                return false;
            }
        }
        return true;
    }
}

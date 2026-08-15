import java.util.ArrayList;
import java.util.List;

public class Q1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[n * m];
        int z = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[z++] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        int o = n * m;
        z = o - (k % o);
        for (int i = 0; i < n; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                sub.add(arr[z % o]);
                z++;
            }
            res.add(sub);
        }
        return res;
    }
}
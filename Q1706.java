public class Q1706 {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [] result = new int[m];
        for(int k=0;k<m;k++) {
            int flag = 0;
            int i = 0, j = k;
            while (i >= 0 && j >= 0 && i < n && j < m) {
                if (grid[i][j] == 1) {
                    if (j == m - 1) {
                        if (i != n - 1) {
                            flag = -1;
                        }
                        flag=j+1;
                        break;
                    }
                    if (grid[i][j + 1] == -1) {
                        flag = -1;
                        break;
                    }
                    if(i==n-1){
                        flag=j+1;
                        break;
                    }
                    i++;
                    j++;
                } else {

                    if (j == 0) {
                        if (i != n - 1) {
                            flag = -1;
                        }
                        flag=j-1;
                        break;
                    }
                    if (grid[i][j - 1] == 1) {
                        flag = -1;
                        break;
                    }
                    if(i==n-1){
                        flag=j-1;
                        break;
                    }
                    i++;
                    j--;
                }
            }
            if (flag == -1||flag==m) {
                result[k] = -1;
            } else {
                result[k] = flag;
            }

        }
        return result;
    }


    
}

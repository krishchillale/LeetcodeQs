public class Q64 {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] dp = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return helper(grid,0,0,dp);
    }
    static int helper(int [][] grid,int i,int j,int [][]dp){
        if(i== grid.length||j== grid[0].length){
            return 40000000;
        }
        if(i== grid.length-1&&j== grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = helper(grid, i+1, j, dp);
        int right = helper(grid, i, j+1, dp);
        dp[i][j]=grid[i][j]+Math.min(down,right);
        return dp[i][j];
    }
}

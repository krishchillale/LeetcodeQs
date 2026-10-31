public class Q3665 {
    public int uniquePaths(int[][] grid) {
        int [][][] dp = new int[grid.length][grid[0].length][2];
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j][0]=-1;
                dp[i][j][1]=-1;
            }
        }
        return helper(grid,0,0,dp,0);
    }
    static int helper(int [][] grid, int i,int j,int [][][]dp,int mov){
        if(i==grid.length-1&&j==grid[0].length-1){
            return 1;
        }
        if(i==grid.length||j==grid[0].length){
            return 0;
        }
        if(grid[i][j]==0&&dp[i][j][0]!=-1){
            return dp[i][j][0];
        }
        if(grid[i][j]==1&&dp[i][j][mov]!=-1){
            return dp[i][j][mov];
        }
        int mod = 1000000007;
        if(grid[i][j]==1){
            if(mov==1){
                dp[i][j][mov]=helper(grid, i+1, j, dp,0)%mod;
            }
            else{
                dp[i][j][mov]=helper(grid, i, j+1, dp, 1)%mod;
            }
        }
        else{
            dp[i][j][0]=(helper(grid, i, j+1, dp,1)+helper(grid, i+1, j, dp, 0))%mod;
            dp[i][j][1]=dp[i][j][0];
        }
        return dp[i][j][mov];
    }
}

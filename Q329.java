public class Q329 {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] dp = new int [n][m];
        int [][] vis = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dp[i][j]!=-1){
                    max = Math.max(max,dp[i][j]);
                }
                else{
                    max = Math.max(max,helper(matrix,vis,dp,i,j,-1));
                }
            }
        }
        return max;
    }
    static int helper(int [][] matrix,int [][] vis, int [][] dp,int i,int j,int prev){
        if(i<0||j<0||i==vis.length||j==vis[0].length||prev>=matrix[i][j]){
            return 0;
        }
        if(vis[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        vis[i][j]=1;
        int left = helper(matrix, vis, dp, i, j-1,matrix[i][j]);
        int right = helper(matrix, vis, dp, i, j+1,matrix[i][j]);
        int up = helper(matrix, vis, dp, i-1, j,matrix[i][j]);
        int down = helper(matrix, vis, dp, i+1, j,matrix[i][j]);
        vis[i][j]=0;
        dp[i][j]= 1+Math.max(left,Math.max(up,Math.max(right,down)));
        return dp[i][j];
    }
}

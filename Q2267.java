public class Q2267 {
    public boolean hasValidPath(char[][] grid) {
        int [][][] dp = new int [grid.length][grid[0].length][(grid.length*grid[0].length)/2];
        return helper(grid,0,0,0,dp,(grid.length*grid[0].length)/2);
    }
    static boolean helper(char [][] grid,int i,int j,int count,int [][][] dp,int max){
        if(grid[i][j]=='('){
            count++;
        }
        else{
            count--;
        }
        if(count==0&&i==grid.length-1&&j==grid[0].length-1){
            return true;
        }
        if(i==grid.length-1&&j==grid[0].length-1){
            return false;
        }
        if(count<0||count>max){
            return false;
        }
        if(dp[i][j][count]!=0){
            if(dp[i][j][count]==-1){
                return false;
            }
            return true;
        }
        if(i<grid.length-1&&helper(grid,i+1,j,count,dp,max)){
            dp[i][j][count]=1;
            return true;
        }
        if(j<grid[0].length-1&&helper(grid,i,j+1,count,dp,max)){
            dp[i][j][count]=1;
            return true;
        }
        dp[i][j][count]=-1;
        return false;
    }
}

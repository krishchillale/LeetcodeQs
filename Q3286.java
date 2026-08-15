import java.util.List;

public class Q3286 {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();
        int [][] visited = new int [n][m];
        int [][][] dp = new int [n][m][health+1];
        return fs(grid,0,0,visited,health,dp);
    }
    static boolean fs(List<List<Integer>> grid,int i,int j,int [][] visited,int health,int [][][] dp){
        int n = grid.size();
        int m = grid.get(0).size();
        if((i==n||j==m)||i==-1||j==-1){
            return false;
        }
        if(visited[i][j]==1){
            return false;
        }
        if(grid.get(i).get(j)==1){
            health--;
        }
        if(health<=0){
            return false;
        }
        if(i==n-1&&j==m-1){
            return true;
        }
        if(dp[i][j][health]==1){
            return true;
        }
        else if(dp[i][j][health]==-1){
            return false;
        }
        visited[i][j]=1;
        boolean left = fs(grid,i,j-1,visited,health,dp);
        boolean right = fs(grid,i,j+1,visited,health,dp);
        boolean down = fs(grid,i+1,j,visited,health,dp);
        boolean up = fs(grid,i-1,j,visited,health,dp);
        visited[i][j]=0;
        if(left||right||down||up){
            dp[i][j][health]=1;
            return true;
        }
        else{
            dp[i][j][health]=-1;
            return false;
        }
    }
}

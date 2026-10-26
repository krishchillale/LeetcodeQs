public class Q3619 {
    public int countIslands(int [][] grid,int k){
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]&&grid[i][j]!=0){
                    int ans = dfs(grid,vis,i,j,k);
                    if(ans%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static int dfs(int [][] grid,boolean [][] vis,int i,int j,int k){
        if(i==-1||i== grid.length||j==-1||j==grid[0].length||grid[i][j]==0||vis[i][j]){
            return 0;
        }
        vis[i][j]=true;
        int up = dfs(grid, vis, i-1, j,k);
        int down = dfs(grid, vis, i+1, j,k);
        int left = dfs(grid, vis, i, j-1,k);
        int right = dfs(grid, vis, i, j+1,k);
        return (grid[i][j]+up+down+right+left)%k;
    }
}

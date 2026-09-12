public class Q1559 {
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean[n][m];
        boolean [][] path = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]&&dfs(i,j,-1,-1,grid,vis,path,grid[i][j])){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(int i,int j,int pi,int pj,char[][] grid, boolean[][] vis,boolean [][] path,char target){
        if(vis[i][j]&&path[i][j]){
            return true;
        }
        if(vis[i][j]){
            return false;
        }
        vis[i][j]=true;
        path[i][j]=true;
        if(i+1!=pi&&i<grid.length-1&&grid[i+1][j]==target){

            if(dfs(i+1, j,i,j ,grid, vis, path, target)){
                return true;
            }
        }
        if(j+1!=pj&&j<grid[0].length-1&&grid[i][j+1]==target){

            if(dfs(i, j+1,i,j, grid, vis, path, target)){
                return true;
            }
        }
        if(i-1!=pi&&i>0&&grid[i-1][j]==target){

            if(dfs(i-1, j,i,j, grid, vis, path, target)){
                return true;
            }
        }
        if(j-1!=pj&&j>0&&grid[i][j-1]==target){

            if(dfs(i, j-1,i,j, grid, vis, path, target)){
                return true;
            }
        }
        path[i][j]=false;
        return false;
    }
}

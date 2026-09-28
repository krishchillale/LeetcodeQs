public class Q130 {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        char [][] temp = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    temp[i][j]=board[i][j];
                }
                else {
                    temp[i][j] = 'X';
                }
            }
        }
        boolean [][] vis = new boolean [n][m];
        for(int i=0;i<n;i++){
            if(temp[i][0]=='O'&&!vis[i][0]){
                helper(board,temp,vis,i,0);
            }
        }
        for(int i=0;i<m;i++){
            if(temp[0][i]=='O'&&!vis[0][i]){
                helper(board,temp,vis,0,i);
            }
        }
        for(int i=0;i<n;i++){
            if(temp[i][m-1]=='O'&&!vis[i][m-1]){
                helper(board,temp,vis,i,m-1);
            }
        }
        for(int i=0;i<m;i++){
            if(temp[n-1][i]=='O'&&!vis[n-1][i]){
                helper(board,temp,vis,n-1,i);
            }
        }
        //
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=temp[i][j];
            }
        }
    }
    static void helper(char[][] original,char [][] temp ,boolean[][] vis ,int i,int j){
        if(vis[i][j]){
            return;
        }
        vis[i][j]=true;
        temp[i][j]='O';
        if(i>0&&original[i-1][j]=='O'&&temp[i-1][j]=='X'){
            helper(original, temp, vis, i-1, j);
        }
        if(j>0&&original[i][j-1]=='O'&&temp[i][j-1]=='X'){
            helper(original, temp, vis, i, j-1);
        }
        if(i<vis.length-1&&original[i+1][j]=='O'&&temp[i+1][j]=='X'){
            helper(original, temp, vis, i+1, j);
        }
        if(j<vis[0].length-1&&original[i][j+1]=='O'&&temp[i][j+1]=='X'){
            helper(original, temp, vis, i, j+1);
        }
    }
}

public class Q289 {
    public void gameOfLife(int[][] board) {
        int n = board.length;;
        int m = board[0].length;
        int [][] ans = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                if(board[i][j]==1){
                    if(i<n-1&&board[i+1][j]==1){
                        count++;
                    }
                    if(j<m-1&&board[i][j+1]==1){
                        count++;
                    }
                    if(i>0&&board[i-1][j]==1){
                        count++;
                    }
                    if(j>0&&board[i][j-1]==1){
                        count++;
                    }
                    if(i>0&&j>0&&board[i-1][j-1]==1) {
                        count++;
                    }
                    if(i>0&&j<m-1&&board[i-1][j+1]==1){
                        count++;
                    }
                    if(i<n-1&&j>0&&board[i+1][j-1]==1){
                        count++;
                    }
                    if(i<n-1&&j<m-1&&board[i+1][j+1]==1){
                        count++;
                    }
                    if(count==2||count==3){
                        ans[i][j]=1;
                    }
                    else{
                        ans[i][j]=0;
                    }
                }
                else{
                    if(i<n-1&&board[i+1][j]==1){
                        count++;
                    }
                    if(j<m-1&&board[i][j+1]==1){
                        count++;
                    }
                    if(i>0&&board[i-1][j]==1){
                        count++;
                    }
                    if(j>0&&board[i][j-1]==1){
                        count++;
                    }
                    if(i>0&&j>0&&board[i-1][j-1]==1) {
                        count++;
                    }
                    if(i>0&&j<m-1&&board[i-1][j+1]==1){
                        count++;
                    }
                    if(i<n-1&&j>0&&board[i+1][j-1]==1){
                        count++;
                    }
                    if(i<n-1&&j<m-1&&board[i+1][j+1]==1){
                        count++;
                    }
                    if(count==3){
                        ans[i][j]=1;
                    }
                    else{
                        ans[i][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}

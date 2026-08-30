public class Q79 {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean [][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)&&helper(board,word,vis,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean helper(char [][] board,String word,boolean [][] vis,int i,int j){
        if(word.isEmpty()){
            return true;
        }
        if(i == board.length||i==-1||j==-1||j== board[0].length){
            return false;
        }
        if(vis[i][j]||board[i][j]!=word.charAt(0)){
            return false;
        }
        vis[i][j]=true;
        if(helper(board,word.substring(1),vis,i-1,j)){
            return true;
        }
        if(helper(board,word.substring(1),vis,i+1,j)){
            return true;
        }
        if(helper(board,word.substring(1),vis,i,j-1)){
            return true;
        }
        if(helper(board,word.substring(1),vis,i,j+1)){
            return true;
        }
        vis[i][j]=false;
        return false;
    }
}

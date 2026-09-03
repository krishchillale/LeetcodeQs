import java.util.LinkedList;
import java.util.Queue;

public class Q994 {
    class coord{
        int i,j;
        public coord(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<coord> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int fresh=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m ;j++){
                if(grid[i][j]==2){
                    q.add(new coord(i,j));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int min=0;
        q.add(null);
        while(!q.isEmpty()){
            coord curr = q.remove();
            if(curr==null){
                min++;
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
                int i=curr.i;
                int j=curr.j;
                if(i>0&&grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    q.add(new coord(i-1,j));
                    fresh--;
                }
                if(j>0&&grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    q.add(new coord(i,j-1));
                    fresh--;
                }
                if(i<n-1&&grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    q.add(new coord(i+1,j));
                    fresh--;
                }
                if(j<m-1&&grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    q.add(new coord(i,j+1));
                    fresh--;
                }
            }
        }
        if(fresh!=0){
            return -1;
        }
        return --min;
    }
}

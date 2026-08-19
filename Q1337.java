import java.util.PriorityQueue;

public class Q1337 {
    class row implements Comparable<row>{
        int sold;
        int index;
        public row(int sold,int index){
            this.sold=sold;
            this.index=index;
        }
        @Override
        public int compareTo(row other) {
            if(other.sold!=this.sold){
                return other.sold-this.sold;
            }
            else{
                return other.index- this.index;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            int sold=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    sold++;
                }
            }
            pq.add(new row(sold,i));
        }
        for(int i=k;i<mat.length;i++){
            int sold=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    sold++;
                }
            }
            pq.add(new row(sold,i));
            pq.remove();
        }
        int [] result = new int [k];
        for(int i=k-1;i>-1;i--){
            result[i]=pq.remove().index;
        }
        return result;
    }
}

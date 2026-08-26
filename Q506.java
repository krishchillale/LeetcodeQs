import java.util.PriorityQueue;

public class Q506 {
    class Rank implements Comparable<Rank> {
        int index,score;
        public Rank(int index ,int score){
            this.index=index;
            this.score=score;
        }
        @Override
        public int compareTo(Rank other){
            return other.score-this.score;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Rank> pq = new PriorityQueue<>();
        int n = score.length;
        for(int i=0;i<n;i++){
            pq.add(new Rank(i,score[i]));
        }
        String [] res = new String[n];
        res[pq.remove().index]="Gold Medal";
        if(n==1){
            return res;
        }
        res[pq.remove().index]="Silver Medal";
        if(n==2){
            return res;
        }
        res[pq.remove().index]="Bronze Medal";
        int rank=4;
        while(!pq.isEmpty()){
            res[pq.remove().index]= Integer.toString(rank++);
        }
        return res;
    }
}

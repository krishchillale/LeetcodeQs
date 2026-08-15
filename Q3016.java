import java.util.PriorityQueue;
public class Q3016 {
    static class alpha implements Comparable<alpha>{
        int idx;
        int val;
        alpha(int idx,int val){
            this.idx=idx;
            this.val=val;
        }

        @Override
        public int compareTo(alpha o) {
            return o.val-this.val;
        }
    }
    public int minimumPushes(String word) {
        int [] hash = new int [26];
        for(int i=0;i<word.length();i++){
            hash[word.charAt(i)]++;
        }
        PriorityQueue<alpha> pq = new PriorityQueue<>();
        for(int i=0;i<26;i++){
            pq.add(new alpha(i,hash[i]));
        }
        int round=1;
        int count=0;
        int p=0;
        while(!pq.isEmpty()){
            count+=(round*pq.remove().val);
            p++;
            if(p==8){
                round++;
                p=0;
            }
        }
        return count;
    }
}

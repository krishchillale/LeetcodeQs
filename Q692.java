import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Q692 {
    class Pair implements Comparable<Pair>{
        String s;
        int freq;
        public Pair(String s,int freq){
            this.freq=freq;
            this.s=s;
        }
        @Override
        public int compareTo(Pair other){
            if(other.freq==this.freq){
                return this.s.compareTo(other.s);
            }
            return other.freq-this.freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(String s : map.keySet()){
            pq.add(new Pair(s, map.get(s)));
        }
        map.clear();
        List<String> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(pq.remove().s);
        }
        return res;
    }
}

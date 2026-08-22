import java.util.HashMap;
import java.util.PriorityQueue;

public class Q347 {
    class Element implements Comparable<Element>{
        int num, freq;
        public Element(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
        @Override
        public int compareTo(Element other){
            return other.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            pq.add(new Element(key,map.get(key)));
        }
        int [] res = new int [k];
        for(int i=0;i<k;i++){
            res[i]=pq.remove().num;
        }
        return res;
    }
}

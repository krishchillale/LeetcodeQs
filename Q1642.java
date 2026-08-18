import java.util.PriorityQueue;

public class Q1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0,n= heights.length;
        int prev=heights[0];
        while(i<n&&pq.size()!=ladders){
            if(prev<heights[i]) {
                pq.add(heights[i] - prev);
            }
            prev = heights[i++];
        }
        for(i=i;i<n;i++){
            if(prev<heights[i]){
                if(!pq.isEmpty()&&heights[i]-prev>pq.peek()){
                    bricks-=pq.remove();
                    if(bricks<0){
                        break;
                    }
                    pq.add(heights[i]-prev);
                }
                else{
                    if(bricks<heights[i]-prev){
                        break;
                    }
                    bricks-=heights[i]-prev;
                }
            }
            prev=heights[i];
        }
        return i-1;
    }
}

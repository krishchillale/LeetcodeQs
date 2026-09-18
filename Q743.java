import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q743 {
   public class edge {
        int neigbour,weight;

        public edge( int neigbour,int weight){
            this.neigbour=neigbour;
            this.weight=weight;
        }
    }
    class Pair implements Comparable<Pair>{
       int dist;
       int node;
       @Override
        public int compareTo(Pair other){
           return this.dist-other.dist;
       }
        public Pair(int node,int dist){
            this.node = node;
            this.dist=dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<edge> [] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<times.length;i++){
            int u = times[i][0]-1;
            int v = times[i][1]-1;
            int w = times[i][2];
            edge e = new edge(v,w);
            graph[u].add(e);
        }
        int [] ans = new int [n];
        for(int i=0;i<n;i++){
            ans[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k-1,0));
        ans[k-1]=0;
        boolean [] vis = new boolean [n];
        int max = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            int index = curr.node;
            if(vis[index]){
                continue;
            }
            vis[index]=true;
           max =  Math.max(max,ans[index]);
            for(int i=0;i<graph[index].size();i++){
                edge e = graph[index].get(i);
                int neighbour = e.neigbour;
                int weight  = e.weight;
                if(ans[neighbour]>ans[index]+weight){
                    ans[neighbour]=ans[index]+weight;
                }
                pq.add(new Pair(neighbour,ans[neighbour]));
            }
        }
        for(int i=0;i<n;i++){
            if(ans[i]==Integer.MAX_VALUE){
                return -1;
            }
        }
        return max;
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1834 {
    class task implements Comparable<task>{
        int enqueue,comp,index;
        public task(int enqueue,int comp,int index){
            this.enqueue=enqueue;
            this.comp=comp;
            this.index=index;
        }
        @Override
        public int compareTo(task other){
            if(other.comp!=this.comp){
                return this.comp-other.comp;
            }
            return this.index-other.index;
        }
    }
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int [][] arr = new int [n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=tasks[i][0];
            arr[i][1]=tasks[i][1];
            arr[i][2]=i;
        }
        Arrays.sort(arr, Comparator.comparingDouble(o->o[0]));
        int time=arr[0][0];
        int i=0;
        int []  result = new int [n];
        int k=0;
        PriorityQueue<task> pq = new PriorityQueue<>();
        while(i<n){
            while(i<n&&time>=arr[i][0]){
                pq.add(new task(arr[i][0],arr[i][1],arr[i++][2]));
            }
            if(!pq.isEmpty()) {
                time += pq.peek().comp;
                result[k++] = pq.remove().index;
            }
            else if(i<n){
                time=arr[i][0];
                pq.add(new task(arr[i][0],arr[i][1],arr[i++][2]));
            }
            }
        while(!pq.isEmpty()){
            time+=pq.peek().comp;
            result[k++]=pq.remove().index;
        }
        return result;
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class Q933 {
    class RecentCounter {
        Queue <Integer> q;
        public RecentCounter() {
            q = new LinkedList();
        }

        public int ping(int t) {
            q.add(t);
            while (!q.isEmpty()&&q.peek()<t-3000){
                q.remove();
            }
            return q.size();
        }
    }
}

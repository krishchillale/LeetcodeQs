import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Q2751 {

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Robo> pq = new PriorityQueue<>();
        int n = positions.length;
        for(int i=0;i<n;i++){
            pq.add(new Robo(i,healths[i],positions[i],directions.charAt(i) ));
        }
        Stack<Robo> s = new Stack<>();
        s.push(pq.remove());
        while(!pq.isEmpty()){
            while(!s.isEmpty()&&s.peek().dir!=pq.peek().dir){
                    if(s.peek().health>pq.peek().health){
                        s.peek().health--;
                        pq.peek().health=0;
                        break;
                    }
                    else if(s.peek().health<pq.peek().health){
                        pq.peek().health--;
                        s.pop();
                    }
                    else{
                        s.pop();
                        pq.peek().health=0;
                        break;
                    }
            }
            if(pq.peek().health!=0){
                s.push(pq.remove());
            }
            else{
                pq.remove();
            }
        }
        PriorityQueue<Robo2> p = new PriorityQueue<>();
        while(!s.isEmpty()){
            p.add(new Robo2(s.peek().index,s.peek().health));
            s.pop();
        }
        while(!p.isEmpty()){
            res.add(p.remove().health);
        }
        return res;
    }
    class Robo implements Comparable<Robo>{
        int index;
        int health;
        int position;
        char dir;
        Robo(int index,int health,int position,char dir){
            this.index=index;
            this.health=health;
            this.position=position;
            this.dir=dir;
        }
        @Override
        public int compareTo(Robo other){
            return other.position-this.position;
        }
    }
    class Robo2 implements Comparable<Robo2>{
        int index;
        int health;
        Robo2(int index,int health){
            this.index=index;
            this.health=health;
        }
        @Override
        public int compareTo(Robo2 other){
            return this.index-other.index;
        }
    }
}

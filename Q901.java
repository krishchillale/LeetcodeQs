import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q901 {
    class StockSpanner {
        ArrayList<Integer> list ;
        public StockSpanner() {
            list = new ArrayList<>();
        }

        public int next(int price) {
            if(list.isEmpty()){
                list.add(price);
                return 1;
            }
            int count=1;
            for(int i = list.size()-1;i>=0;i--){
                if(price>=list.get(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            list.add(price);
            return count;
        }
    }
}

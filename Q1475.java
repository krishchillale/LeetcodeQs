import java.util.Stack;

public class Q1475 {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int [] ans = new int [n];
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=prices[i];
            }
            else{
                ans[i]=prices[i]- s.peek();
            }
            s.push(prices[i]);
        }
        return ans;
    }
}

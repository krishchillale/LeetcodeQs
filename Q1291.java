import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int n = Integer.toString(high).length();
        helper(low,high,result,1,0);
        helper(low,high,result,2,0);
        helper(low,high,result,3,0);
        helper(low,high,result,4,0);
        helper(low,high,result,5,0);
        helper(low,high,result,6,0);
        helper(low,high,result,7,0);
        helper(low,high,result,8,0);
        helper(low,high,result,9,0);
        Collections.sort(result);
        return result;
    }
    static void helper(int low,int high,List<Integer> result,int start,int num){
        if(start==10){
            return;
        }
        num=num*10+start;
        if(low<=num&&num<=high){
            result.add(num);
        }
        if(num>high){
            return;
        }
        helper(low,high,result,start+1,num);
    }
}

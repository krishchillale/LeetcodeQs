import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Q89 {
    public List<Integer> grayCode(int n) {
        int size = (int)Math.pow(2,n);
        List<Integer> res = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<n;i++){
            s.append('0');
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        res.add(0);
        set.add(0);
        while(res.size()<size){
            for(int i=0;i<s.length();i++){
                StringBuilder sb = new StringBuilder(s);
                if(sb.charAt(i)=='0'){
                    sb.setCharAt(i,'1');
                }
                else{
                    sb.setCharAt(i,'1');
                }
                int num = Integer.parseInt(sb.toString());
                if(!set.contains(num)){
                    res.add(num);
                    s=sb;
                    break;
                }
            }
        }
        return res;
    }
}

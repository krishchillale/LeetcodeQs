import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        if(n<10){
            return ans;
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n-9;i++){
            String sb = s.substring(i,i+10);
            if(!map.containsKey(sb)){
                map.put(sb,1);
            }
            else if(map.get(sb)==1){
                ans.add(sb);
                map.put(sb,2);
            }
        }
        return ans;
    }
}

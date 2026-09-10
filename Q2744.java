import java.util.HashMap;

public class Q2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        HashMap<String,Integer> map = new HashMap<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if(map.containsKey(reversed)){
                count++;
            }
            map.put(words[i],1);
        }
        return count;
    }
}

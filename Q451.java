import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Q451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!map.isEmpty()){
            int max=0;
            char c='0';
            for(char ch : map.keySet()){
                if(max<map.get(ch)){
                    max=map.get(ch);
                    c=ch;
                }
            }
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
            map.remove(c);
        }
        return sb.toString();
    }
}

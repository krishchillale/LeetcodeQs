import java.util.HashMap;

public class Q1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashMap<Integer,Integer> m1 = new HashMap<>();
        for(int key : map.keySet()){
            if(m1.containsKey(map.get(key))){
                return false;
            }
            m1.put(map.get(key),1);
        }
        return true;
    }
}

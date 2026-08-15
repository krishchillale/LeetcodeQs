import java.util.*;
public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<int[]> map = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            int [] hash = new int [26];
            for(int j=0;j<strs[i].length();j++){
                hash[strs[i].charAt(j)-97]++;
            }
            int flag=0;
            for(int j=0;j<map.size();j++){
                if (Arrays.equals(map.get(j), hash)){
                    result.get(j).add(strs[i]);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                map.add(hash);
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp);
            }
        }
        return result;
    }
}

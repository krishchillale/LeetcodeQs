import java.util.ArrayList;
import java.util.List;
public class Q438 {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        if(m>n){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int [] map1 = new int [26];
        int [] map2 = new int [26];
        for(int i=0;i<m;i++){
            map1[p.charAt(i)-'a']++;
            map2[s.charAt(i)-'a']++;
        }
        if(isEqual(map1,map2)){
            result.add(0);
        }
        int i=1,j=m;
        while(j<n){
            map2[s.charAt(i-1)-'a']--;
            map2[s.charAt(j)-'a']++;
            if(isEqual(map1,map2)){
                result.add(i);
            }
            i++;
            j++;
        }
        return result;
    }
    static boolean isEqual(int [] arr1,int [] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

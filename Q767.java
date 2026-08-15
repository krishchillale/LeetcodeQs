import java.util.Arrays;
import java.util.Comparator;

public class Q767 {
    public String reorganizeString(String s) {
        int n = s.length();
        if(n==1){
            return "";
        }
        int[][] hash = new int [26][2];
        for(int i=0;i<s.length();i++){
            hash[(int)s.charAt(i)-97][0]++;
            hash[(int)s.charAt(i)-97][1]=(int)s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(hash, (a, b) -> Integer.compare(b[0], a[0]));
        if(n%2==0){
            if(hash[0][0]>n/2){
                return "";
            }
        }
        else{
            if(hash[0][0]>(n+1)/2){
                return "";
            }
        }
        for(int i=0;i<n;i++){
            sb.append('0');
        }
        int j=0;
       for(int i=0;i<n;i=i+2){
           if(hash[j][0]==0){
               j++;
           }
           else{
               sb.setCharAt(i,(char)hash[j][1]);
               hash[j][0]--;
           }
       }
       for(int i=1;i<n;i=i+2){
           if(hash[j][0]==0){
               j++;
           }
           else{
               sb.setCharAt(i,(char)hash[j][1]);
               hash[j][0]--;
           }
       }
        return sb.toString();
    }
}

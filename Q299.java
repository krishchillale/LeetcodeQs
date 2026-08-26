import java.util.HashMap;

public class Q299 {
    public String getHint(String secret, String guess) {
        int [] map = new int [10];
        int n = secret.length();
        int bulls=0,cows=0;
        for(int i=0;i<n;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            else{
                map[secret.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<n;i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                if(map[guess.charAt(i)-'0']>0){
                    map[guess.charAt(i)-'0']--;
                    cows++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(bulls));
        sb.append("A");
        sb.append(Integer.toString(cows));
        sb.append("B");
        return sb.toString();
    }
}

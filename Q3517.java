public class Q3517 {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int [] hash = new int [26];
        int n =  s.length();
        if(n%2==0){
            for(int i=0;i<=(n-1)/2;i++){
                hash[s.charAt(i)-97]++;
            }
            int k=0;
            for(int i=0;i<=(n-1)/2;i++){
                while(i<26&&hash[k]==0){
                    k++;
                }
                sb.append((char)(k+97));
                hash[k]--;
            }
            StringBuilder sp = new StringBuilder(sb);
            sp.reverse();
            return sb.toString()+sp.toString();
        }
        else{
            for(int i=0;i<(n-1)/2;i++){
                hash[s.charAt(i)-97]++;
            }
            int k=0;
            for(int i=0;i<(n-1)/2;i++){
                while(i<26&&hash[k]==0){
                    k++;
                }
                sb.append((char)(k+97));
                hash[k]--;
            }
            StringBuilder sp = new StringBuilder(sb);
            sp.reverse();
            return sb.toString()+s.charAt(n/2)+sp.toString();
        }
    }
}

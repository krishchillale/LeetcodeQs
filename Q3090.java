public class Q3090 {
    public int maximumLengthSubstring(String s) {
        int [] hash = new int [26];
        int n = s.length();
        int i = 0,j=0;
        int max = 0;
        while(j<n){
            hash[s.charAt(j)-'a']++;
            if(hash[s.charAt(j)-'a']>2){
                while(s.charAt(i)!=s.charAt(j)){
                    hash[s.charAt(i)-'a']--;
                    i++;
                }
                hash[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}

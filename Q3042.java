public class Q3042 {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
                int count=0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(is(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static boolean is(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;
        }
        int i=0,j=n-1,k=m-1;
        while(i<n&&i<m&&j>=0&&k>=0){
            if(s1.charAt(i)!=s2.charAt(i++)){
                return false;
            }
            if(s1.charAt(j--)!=s2.charAt(k--)){
                return false;
            }
        }
        while (i<n&&i<m){
            if(s1.charAt(i)!=s2.charAt(i++)){
                return false;
            }
        }
        while (j>=0&&k>=0){
            if(s1.charAt(j--)!=s2.charAt(k--)){
                return false;
            }
        }
        return true;
    }
}

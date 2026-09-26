public class Q1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int []  hash = new int [26];
        for(int i=0;i<allowed.length();i++){
            hash[allowed.charAt(i)-'a']++;
        }
        int count=0;
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<words[i].length();j++){
                if(hash[words[i].charAt(j)-'a']==0){
                    count++;
                    break;
                }
            }
        }
        return n-count;
    }
}

public class Q1832 {
    public boolean checkIfPangram(String s) {
        int [] hash = new int [26];
        for(int i = 0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]<1){
                return false;
            }
        }
        return true;
    }
}

public class Q3442 {
    public int maxDifference(String s) {
        int [] hash = new int [26];
        int n = s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        int max2=0,min1=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(hash[i]==0){
                continue;
            }
            if(hash[i]%2==0){
                min1=Math.min(min1,hash[i]);
            }
            else{
                max2=Math.max(max2,hash[i]);
            }
        }
        return max2-min1;
    }
}

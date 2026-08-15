public class Q1358 {
    public int numberOfSubstrings(String s) {
        int count=0;
        int n = s.length();
        int [][] hash = new int [n][3];
        int preva=-1,prevb=-1,prevc=-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                preva=i;
            }
            else if(s.charAt(i)=='b'){
                prevb=i;
            }
            else{
                prevc=i;
            }
            hash[i][0]=preva;
            hash[i][1]=prevb;
            hash[i][2]=prevc;
        }
        for(int i=0;i<n;i++){
            if(hash[i][0]==-1||hash[i][1]==-1||hash[i][2]==-1){
                break;
            }
            int start = Math.max(Math.max(hash[i][0],hash[i][1]),hash[i][2]);
            count+=n-start;
        }
        return count;
    }
}

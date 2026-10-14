public class Q3723 {
    public String maxSumOfSquares(int num, int sum) {
        int score=0;
        int count=0;
        int curr=0;
        StringBuilder sb = new StringBuilder();
        while(count<num){
            for(int i=9;i>-1;i--){
                if(curr+i<=sum){
                    sb.append((char)(i+'0'));
                    curr+=i;
                    score+=(int)Math.pow(i,2);
                    count++;
                    break;
                }
            }
        }
        if(curr!=sum){
            return "";
        }
        return sb.toString();
    }
}

public class Q3753 {
    public static long totalWaviness(long num1, long num2)
    {
            if(num2<=100){
                return 0;
            }
            if(num1<=100){
                num1=101;
            }
        long [] dp = new long [(int)(num2 + 1)];
            long count=0;
            for(long i=num1;i<=num2;i++){
                StringBuilder sb = new StringBuilder(String.valueOf(i));
                char prev = sb.charAt(0);
                sb.deleteCharAt(0);
                long sub=0;
                while(sb.length()>1){
                    long o = Long.parseLong(sb.toString());
                    if(o >= 0 && o <= num2 && dp[(int)o]!=0){

                        count+=dp[(int)o];
                        sub+=dp[(int)o];
                        break;
                    }
                    char curr = sb.charAt(0);
                    char next = sb.charAt(1);
                    if(curr>prev&&curr>next||curr<prev&&curr<next){
                        count++;
                        sub++;
                    }
                    prev=curr;
                    sb.deleteCharAt(0);
                }
                dp[(int)i]=sub;
            }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(totalWaviness(120,130));
    }
}

public class Q3751 {
    public int totalWaviness(int num1, int num2) {
        if(num2<=100){
            return 0;
        }
        if(num1<=100){
            num1=101;
        }
        int count=0;
        for(int i=num1;i<=num2;i++){
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            int prev = sb.charAt(0)-'0';
            for(int j=1;j<sb.length()-1;j++){
                int curr = sb.charAt(j)-'0';
                int next = sb.charAt(j+1)-'0';
                if(curr>prev&&curr>next||curr<prev&&curr<next){
                    count++;
                }
                prev=curr;
            }
        }
        return count;
    }
}

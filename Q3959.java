public class Q3959 {
    public boolean checkGoodInteger(int n) {
        int temp=n;
        int sq=0,sum=0;
        while(temp>0){
            sum+=temp%10;
            sq+=(int) Math.pow(temp%10,2);
            temp/=10;
        }
        if(sq-sum>=50){
            return true;
        }
        return false;
    }
}

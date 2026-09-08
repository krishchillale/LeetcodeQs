public class Q3870 {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int count=0;
        if(n==100000){
            count++;
            n--;
        }
        if(n>=10000){
            count+=n-10000+1;
            n=9999;
        }
        if(n>=1000){
            count+=n-1000+1;
        }
        return count;
    }
}

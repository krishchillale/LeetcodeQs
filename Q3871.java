public class Q3871 {
    public long countCommas(long n) {
        if(n<1000L){
            return 0;
        }
        long count=0;
        if(n>=1000L&&n<1000000L){
            count+=n-1000L+1;
            return count;
        }
        count=999000L;
        if(n>=1000000L&&n<1000000000L){
            count+=2*(n-1000000L+1);
            return count;
        }
        count+=2*(1000000000L-1000000L);
        if(n>=1000000000&&n<1000000000000L){
            count+=3*(n-1000000000L+1);
            return count;
        }
        count+=3*(1000000000000L-1000000000L);
        if(n>=1000000000000L&&n<1000000000000000L){
            count+=4*(n-1000000000000L+1);
            return count;
        }
        count+=4*(1000000000000000L-1000000000000L);
        count+=5;
        return count;
    }
}

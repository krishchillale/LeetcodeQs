public class Q3658 {
        public int gcdOfOddEvenSums(int n) {
            int sum1=0,sum2=0;
            for(int i=1;i<=n;i++){
                sum1+=2*i-1;
                sum2+=2*i;
            }
            return gcd(sum1,sum2);
        }
        static int gcd(int n1,int n2){
            int temp = n1;
            while(temp>0){
                if(n1%temp==0&&n2%temp==0){
                  return temp;
                }
                else{
                    temp--;
                }
            }
            return temp;
        }
}
